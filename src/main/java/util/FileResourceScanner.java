package util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

public abstract class FileResourceScanner<R> extends AbstractFileResourceScanner<R> {
    public FileResourceScanner() {
    }

    final void handleResource(URL url, String path, IResourceScanned<R> scanned) throws IOException {
        File parent = null;

        try {
            parent = new File(url.toURI());
            this.handleFile(parent, "", scanned);
        } catch (URISyntaxException var6) {
            ;
        }

    }

    private void handleFile(File parent, String relativePath, IResourceScanned<R> scanned) throws IOException {
        InputStream is = null;
        if (parent != null && parent.exists()) {
            try {
                File[] childs = parent.listFiles();
                File[] arr$ = childs;
                int len$ = childs.length;

                for(int i$ = 0; i$ < len$; ++i$) {
                    File child = arr$[i$];
                    String fullPath = normalizePath(child.getAbsolutePath()) + (child.isDirectory() ? "/" : "");
                    String nextRelativePath = (relativePath.length() == 0 ? "" : "/") + child.getName();
                    if (child.isFile() && child.exists()) {
                        R resource = this.getAsResource(fullPath, child.getName(), nextRelativePath, (InputStream)is);
                        if (resource != null) {
                            scanned.onScanned(resource);
                        }
                    } else if (child.isDirectory()) {
                        this.handleFile(child, relativePath + "/" + child.getName(), scanned);
                    }
                }
            } catch (IOException var16) {
                throw var16;
            } finally {
                if (is != null) {
                    ((InputStream)is).close();
                }

            }

        }
    }

    public static String normalizePath(String source) {
        return source.replace(File.separator, "/");
    }
}
