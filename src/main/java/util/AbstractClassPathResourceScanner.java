package util;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public abstract class AbstractClassPathResourceScanner<R> extends ResourcesScanner<R> {
    public AbstractClassPathResourceScanner() {
    }

    public final void scan(String path, IResourceScanned<R> scanned) {
        URL url = null;

        try {
            path = this.normalize(path);
            Enumeration urls = ClassLoaderUtils.getClassLoader().getResources(path);

            while(urls.hasMoreElements()) {
                url = (URL)urls.nextElement();
                if (url.getProtocol().equals("jar")) {
                    this.handleResourceJar(url, path, scanned);
                } else if (url.getProtocol().equals("file")) {
                    this.handleResourceFile(url, path, scanned);
                }
            }

        } catch (IOException var5) {
            throw new RuntimeException("Exception occurs when scan resource from " + url + ".cause by " + var5.getMessage());
        }
    }

    public String normalize(String sourcePath) {
        return sourcePath.replace(".", "/");
    }

    private final void handleResourceJar(URL url, String path, IResourceScanned<R> scanned) throws IOException {
        JarFile file = ((JarURLConnection)url.openConnection()).getJarFile();
        String jarFileNameURL = StringUtils.substringBeforeLast(url.toString(), "!") + "!";
        InputStream is = null;

        try {
            Enumeration entries = file.entries();

            while(entries.hasMoreElements()) {
                JarEntry entry = (JarEntry)entries.nextElement();
                String name = entry.getName();
                if (name.charAt(0) == '/') {
                    name = name.substring(1);
                }

                if (name.startsWith(this.normalize(path)) && !name.endsWith("/")) {
                    is = file.getInputStream(entry);
                    String fullPath = jarFileNameURL + name;
                    String simpleName = StringUtils.substringAfterLast(name, "/");
                    R resource = this.getAsResource(fullPath, simpleName, name, is);
                    if (resource != null) {
                        scanned.onScanned(resource);
                    }
                }
            }
        } catch (IOException var16) {
            throw var16;
        } finally {
            if (is != null) {
                is.close();
            }

        }

    }

    private final void handleResourceFile(URL url, String path, IResourceScanned<R> scanned) throws IOException {
        File parent = null;

        try {
            parent = new File(url.toURI());
            this.handleFile(parent, path, scanned);
        } catch (URISyntaxException var6) {
            ;
        }

    }

    private void handleFile(File parent, String relativePath, IResourceScanned<R> scanned) throws IOException {
        InputStream is = null;
        if (parent.isDirectory() && parent.exists()) {
            try {
                File[] childs = parent.listFiles();
                File[] arr$ = childs;
                int len$ = childs.length;

                for(int i$ = 0; i$ < len$; ++i$) {
                    File child = arr$[i$];
                    String fullPath = FileResourceScanner.normalizePath(child.getAbsolutePath()) + (child.isDirectory() ? "/" : "");
                    String nextRelativePath = relativePath + (relativePath.length() == 0 ? "" : "/") + child.getName();
                    if (child.exists()) {
                        if (child.isFile()) {
                            is = new FileInputStream(child);
                            R resource = this.getAsResource(fullPath, child.getName(), nextRelativePath, is);
                            if (resource != null) {
                                scanned.onScanned(resource);
                            }
                        } else if (child.isDirectory()) {
                            this.handleFile(child, nextRelativePath, scanned);
                        }
                    }
                }
            } catch (IOException var16) {
                throw var16;
            } finally {
                if (is != null) {
                    is.close();
                }

            }

        }
    }

    public static String clzName2Path(String clzQN) {
        return clzQN.replace(".", "/") + ".class";
    }

    public static String path2ClzName(String path) {
        return path.substring(0, path.length() - 6).replace(File.separator, ".").replace("/", ".");
    }
}
