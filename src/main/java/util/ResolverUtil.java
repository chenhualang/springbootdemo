package util;

import anotation.Exclude;
import anotation.Name;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import enums.CodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ResolverUtil {
    private static final Logger log = LoggerFactory.getLogger(ResolverUtil.class);
    private static Map<String, ICfgLoader<?>> CFG_LOADER_MAP = new ConcurrentHashMap();
    public ResolverUtil() {
    }

    public static <T> Set<Class<? extends T>> resolver(String pack, Class<T> superClz, final boolean instance) {
        final Set<Class<? extends T>> childs = new HashSet();
        SubclassScanner scanner = new SubclassScanner(superClz);
        scanner.scan(pack, new IResourceScanned<Class<?>>() {
            public void onScanned(Class<?> resource) {
                if (!instance || !Modifier.isAbstract(resource.getModifiers()) && !Modifier.isInterface(resource.getModifiers())) {
                    childs.add((Class<? extends T>) resource);
                }
            }
        });
        return childs;
    }

    public static Set<Class<?>> resolverAnyAnnotation(String pack, final boolean instance, final Class... annotations) {
        final Set<Class<?>> childs = new HashSet();
        SubclassScanner scanner = new SubclassScanner(Object.class);
        scanner.scan(pack, new IResourceScanned<Class<?>>() {
            public void onScanned(Class<?> resource) {
                if (!instance || !Modifier.isAbstract(resource.getModifiers()) && !Modifier.isInterface(resource.getModifiers())) {
                    Class[] arr$ = annotations;
                    int len$ = arr$.length;

                    for (int i$ = 0; i$ < len$; ++i$) {
                        Class<? extends Annotation> annotation = arr$[i$];
                        if (!resource.isAnnotationPresent(annotation)) {
                            return;
                        }
                    }

                    childs.add(resource);
                }
            }
        });
        return childs;
    }

    public static Set<Class<?>> resolverAllAnnotation(String pack, final boolean instance, final Class... annotations) {
        final Set<Class<?>> childs = new HashSet();
        SubclassScanner scanner = new SubclassScanner(Object.class);
        scanner.scan(pack, new IResourceScanned<Class<?>>() {
            public void onScanned(Class<?> resource) {
                if (!instance || !Modifier.isAbstract(resource.getModifiers()) && !Modifier.isInterface(resource.getModifiers())) {
                    Class[] arr$ = annotations;
                    int len$ = arr$.length;

                    for (int i$ = 0; i$ < len$; ++i$) {
                        Class<? extends Annotation> annotation = arr$[i$];
                        if (resource.isAnnotationPresent(annotation)) {
                            childs.add(resource);
                            break;
                        }
                    }

                }
            }
        });
        return childs;
    }

    public static boolean register(String name, ICfgLoader loader) {
        log.warn("register {}。{}", name, loader);
        return CFG_LOADER_MAP.put(name, loader) != null;
    }

    public static void register(Class<? extends CodeEnum> enmClz) {
        Name name = (Name)enmClz.getAnnotation(Name.class);
        register(name == null ? enmClz.getSimpleName() : name.value(), new EnumLoader(enmClz));
    }


    public static List<CfgDTO> load(CfgQueryCondition param) {
        ICfgLoader loader = (ICfgLoader)CFG_LOADER_MAP.get(param.getType());
        if (loader == null) {
            throw new RuntimeException("can't find the loader。");
        } else {
            return loader.load(param);
        }
    }

    public static List<CfgVO> loadVo(CfgQueryCondition param) {
        List<CfgDTO> cfgs = load(param);
        List<CfgVO> cvos = new ArrayList(cfgs.size());
        Iterator i$ = cfgs.iterator();

        while(i$.hasNext()) {
            CfgDTO cfg = (CfgDTO)i$.next();
            cvos.add(toVO(cfg));
        }

        return cvos;
    }

    private static CfgVO toVO(CfgDTO cfg) {
        CfgVO vo = new CfgVO();
        vo.setCode(cfg.getResCode());
        vo.setName(cfg.getResName());
        List<CfgDTO> ccfgs = cfg.getChildResources();
        if (ccfgs != null && ccfgs.size() > 0) {
            List<CfgVO> cvos = new ArrayList(ccfgs.size());
            Iterator i$ = ccfgs.iterator();

            while(i$.hasNext()) {
                CfgDTO c = (CfgDTO)i$.next();
                cvos.add(toVO(c));
            }

            vo.setChildResources(cvos);
        }

        return vo;
    }

//    public static void main(String[] args) {
////        System.out.println(resolver(ResolverUtil.class.getPackage().getName(), ResourcesScanner.class, false));
//        String clzPath = "enums";
//
//        try {
//            Set<Class<? extends CodeEnum>> clazz = ResolverUtil.resolver(clzPath, CodeEnum.class, false);
//            if (clazz != null && clazz.size() > 0) {
//                Iterator i$ = clazz.iterator();
//
//                while (i$.hasNext()) {
//                    Class<? extends CodeEnum> clz = (Class) i$.next();
//                    if (clz.getAnnotation(Exclude.class) == null) {
//                        register(clz);
//                    }
//                }
//            }
//        } catch (Exception var8) {
//            log.warn("scan {} error.cause by {}.", clzPath, var8);
//        }
//
//        System.out.println("解析后的结果为"+ JSON.toJSONString(CFG_LOADER_MAP));
//    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> enumclz = Class.forName("enums.ClaimStatusTypeEnum");
        register("test", new EnumLoader((Class<? extends CodeEnum>) enumclz));
        CfgQueryCondition cond = new CfgQueryCondition();
        cond.setType("test");
        cond.setLoadAll(true);
        List<CfgVO> cfgVos = loadVo(cond);
        String obj = JSONObject.toJSONString(cfgVos, new SerializerFeature[]{SerializerFeature.IgnoreNonFieldGetter});
        System.out.println(obj);
    }

    static {
        try {
            Map<String, ICfgLoader> loaders = ServiceManager.beans(ICfgLoader.class);
            Iterator i$ = loaders.entrySet().iterator();

            while(i$.hasNext()) {
                Map.Entry<String, ICfgLoader> e = (Map.Entry)i$.next();
                ICfgLoader loader = (ICfgLoader)e.getValue();
                String loaderName = (String)e.getKey();
                register(loaderName, loader);
            }
        } catch (Throwable var5) {
            ;
        }

    }
}
