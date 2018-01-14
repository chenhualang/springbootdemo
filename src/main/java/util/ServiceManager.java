package util;

import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServiceManager implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public ServiceManager() {
    }

    public static <T> T service(Class<T> clz) {
        return context().getBean(clz);
    }

    public static <T> T bean(Class<T> beanClz, String name) {
        return context().getBean(name, beanClz);
    }

    public static <T> T bean(Class<T> beanClz) {
        return context().getBean(beanClz);
    }

    public static <T> Map<String, T> beans(Class<T> beanClz) {
        return context().getBeansOfType(beanClz);
    }

    public static ApplicationContext context() {
        if (applicationContext == null) {
            Class var0 = ServiceManager.class;
            synchronized(ServiceManager.class) {
                if (applicationContext == null) {
                    ;
                }
            }
        }

        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Class var2 = ServiceManager.class;
        synchronized(ServiceManager.class) {
            applicationContext = applicationContext;
        }
    }
}
