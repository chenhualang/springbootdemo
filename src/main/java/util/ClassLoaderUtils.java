package util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public final class ClassLoaderUtils {
    private static Method DEFINE_CLASS_METHOD;
    private static Method DEFINE_PACKAGE_METHOD;

    private ClassLoaderUtils() {
    }

    public static ClassLoaderUtils.ClassLoaderHolder setThreadContextClassloader(final ClassLoader newLoader) {
        return (ClassLoaderUtils.ClassLoaderHolder)AccessController.doPrivileged(new PrivilegedAction<ClassLoaderUtils.ClassLoaderHolder>() {
            public ClassLoaderUtils.ClassLoaderHolder run() {
                ClassLoader l = Thread.currentThread().getContextClassLoader();
                Thread.currentThread().setContextClassLoader(newLoader);
                return new ClassLoaderUtils.ClassLoaderHolder(l);
            }
        });
    }

    public static ClassLoader getURLClassLoader(final URL[] urls, final ClassLoader parent) {
        return (ClassLoader)AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public ClassLoader run() {
                return new URLClassLoader(urls, parent);
            }
        });
    }

    public static ClassLoader getURLClassLoader(List<URL> urlList, ClassLoader parent) {
        return getURLClassLoader((URL[])urlList.toArray(new URL[urlList.size()]), parent);
    }

    public static URL getResource(String resourceName, Class<?> callingClass) {
        URL url = Thread.currentThread().getContextClassLoader().getResource(resourceName);
        if (url == null && resourceName.startsWith("/")) {
            url = Thread.currentThread().getContextClassLoader().getResource(resourceName.substring(1));
        }

        ClassLoader cluClassloader = ClassLoaderUtils.class.getClassLoader();
        if (cluClassloader == null) {
            cluClassloader = ClassLoader.getSystemClassLoader();
        }

        if (url == null) {
            url = cluClassloader.getResource(resourceName);
        }

        if (url == null && resourceName.startsWith("/")) {
            url = cluClassloader.getResource(resourceName.substring(1));
        }

        if (url == null) {
            ClassLoader cl = callingClass.getClassLoader();
            if (cl != null) {
                url = cl.getResource(resourceName);
            }
        }

        if (url == null) {
            url = callingClass.getResource(resourceName);
        }

        return url == null && resourceName != null && resourceName.charAt(0) != '/' ? getResource('/' + resourceName, callingClass) : url;
    }

    public static List<URL> getResources(String resourceName, Class<?> callingClass) {
        List<URL> ret = new ArrayList();
        Enumeration urls = new Enumeration<URL>() {
            public boolean hasMoreElements() {
                return false;
            }

            public URL nextElement() {
                return null;
            }
        };

        try {
            urls = Thread.currentThread().getContextClassLoader().getResources(resourceName);
        } catch (IOException var11) {
            ;
        }

        if (!urls.hasMoreElements() && resourceName.startsWith("/")) {
            try {
                urls = Thread.currentThread().getContextClassLoader().getResources(resourceName.substring(1));
            } catch (IOException var10) {
                ;
            }
        }

        ClassLoader cluClassloader = ClassLoaderUtils.class.getClassLoader();
        if (cluClassloader == null) {
            cluClassloader = ClassLoader.getSystemClassLoader();
        }

        if (!urls.hasMoreElements()) {
            try {
                urls = cluClassloader.getResources(resourceName);
            } catch (IOException var9) {
                ;
            }
        }

        if (!urls.hasMoreElements() && resourceName.startsWith("/")) {
            try {
                urls = cluClassloader.getResources(resourceName.substring(1));
            } catch (IOException var8) {
                ;
            }
        }

        if (!urls.hasMoreElements()) {
            ClassLoader cl = callingClass.getClassLoader();
            if (cl != null) {
                try {
                    urls = cl.getResources(resourceName);
                } catch (IOException var7) {
                    ;
                }
            }
        }

        if (!urls.hasMoreElements()) {
            URL url = callingClass.getResource(resourceName);
            if (url != null) {
                ret.add(url);
            }
        }

        while(urls.hasMoreElements()) {
            ret.add((URL) urls.nextElement());
        }

        return (List)(ret.isEmpty() && resourceName != null && resourceName.charAt(0) != '/' ? getResources('/' + resourceName, callingClass) : ret);
    }

    public static InputStream getResourceAsStream(String resourceName, Class<?> callingClass) {
        URL url = getResource(resourceName, callingClass);

        try {
            return url != null ? url.openStream() : null;
        } catch (IOException var4) {
            return null;
        }
    }

    public static Class<?> loadClass(String className, Class<?> callingClass) throws ClassNotFoundException {
        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            if (cl != null) {
                return cl.loadClass(className);
            }
        } catch (ClassNotFoundException var3) {
            ;
        }

        return loadClass2(className, callingClass);
    }

    public static <T> Class<? extends T> loadClass(String className, Class<?> callingClass, Class<T> type) throws ClassNotFoundException {
        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            if (cl != null) {
                return cl.loadClass(className).asSubclass(type);
            }
        } catch (ClassNotFoundException var4) {
            ;
        }

        return loadClass2(className, callingClass).asSubclass(type);
    }

    private static Class<?> loadClass2(String className, Class<?> callingClass) throws ClassNotFoundException {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException var5) {
            try {
                if (ClassLoaderUtils.class.getClassLoader() != null) {
                    return ClassLoaderUtils.class.getClassLoader().loadClass(className);
                }
            } catch (ClassNotFoundException var4) {
                if (callingClass != null && callingClass.getClassLoader() != null) {
                    return callingClass.getClassLoader().loadClass(className);
                }
            }

            throw var5;
        }
    }

    public static boolean systemClassLoaderLoadPackage(String className) {
        return className.startsWith("java") || className.startsWith("sun");
    }

    public static ClassLoader getClassLoader() {
        ClassLoader loader = ClassLoaderUtils.class.getClassLoader();
        if (loader == null) {
            loader = Thread.currentThread().getContextClassLoader();
        }

        if (loader == null) {
            loader = ClassLoader.getSystemClassLoader();
        }

        return loader;
    }

    public static InputStream getAsStream(String path) {
        ClassLoader loader = getClassLoader();
        return loader.getResourceAsStream(path);
    }

    public static Class<?> loadClass(ClassLoader classLoader, byte[] byteCode, String className) {
        try {
            return (Class)DEFINE_CLASS_METHOD.invoke(classLoader, className, byteCode, Integer.valueOf(0), byteCode.length);
        } catch (Exception var4) {
            throw new RuntimeException(var4);
        }
    }

    public static Class<?> loadClass(byte[] byteCode, String className) {
        return loadClass(getClassLoader(), byteCode, className);
    }

    public static Class<?> definePackage(ClassLoader classLoader, String packageName) {
        Object[] args = new Object[]{packageName, null, null, null, null, null, null, null};

        try {
            return (Class)DEFINE_PACKAGE_METHOD.invoke(classLoader, args);
        } catch (Exception var4) {
            throw new RuntimeException(var4);
        }
    }

    static {
        try {
            AccessController.doPrivileged(new PrivilegedExceptionAction<Object>() {
                public Object run() throws Exception {
                    Class<?> cl = Class.forName("java.lang.ClassLoader");
                    ClassLoaderUtils.DEFINE_CLASS_METHOD = cl.getDeclaredMethod("defineClass", String.class, byte[].class, Integer.TYPE, Integer.TYPE);
                    if (!ClassLoaderUtils.DEFINE_CLASS_METHOD.isAccessible()) {
                        ClassLoaderUtils.DEFINE_CLASS_METHOD.setAccessible(true);
                    }

                    ClassLoaderUtils.DEFINE_PACKAGE_METHOD = cl.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class);
                    if (!ClassLoaderUtils.DEFINE_PACKAGE_METHOD.isAccessible()) {
                        ClassLoaderUtils.DEFINE_PACKAGE_METHOD.setAccessible(true);
                    }

                    return null;
                }
            });
        } catch (PrivilegedActionException var1) {
            throw new RuntimeException(var1);
        }
    }

    public static class ClassLoaderHolder {
        ClassLoader loader;

        ClassLoaderHolder(ClassLoader c) {
            this.loader = c;
        }

        public void reset() {
            ClassLoaderUtils.setThreadContextClassloader(this.loader);
        }
    }
}
