package util;

import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassPathClassResourceScanner extends AbstractClassPathResourceScanner<Class<?>> {
    private static Logger log = LoggerFactory.getLogger(ClassPathClassResourceScanner.class);

    public ClassPathClassResourceScanner() {
    }

    public Class<?> getAsResource(String fullPath, String resourceName, String relativePath, InputStream is) {
        if (!fullPath.endsWith(".class")) {
            return null;
        } else {
            String clzName = path2ClzName(relativePath);
            ClassLoader cl = ClassLoaderUtils.getClassLoader();
            Class clz = null;

            try {
                clz = cl.loadClass(clzName);
                if (!this.predicate(clz)) {
                    return null;
                }
            } catch (Throwable var9) {
                log.warn("load class " + clzName + "exception occurs.Cause by " + var9.getMessage());
            }

            return clz;
        }
    }

    public boolean predicate(Class<?> clz) {
        return true;
    }
}
