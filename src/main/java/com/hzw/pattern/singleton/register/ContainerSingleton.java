package com.hzw.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/10 14:37
 * @Description:
 */
public class ContainerSingleton {

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        if (!ioc.containsKey(className)){
            synchronized (ioc){
                if (!ioc.containsKey(className)){
                    try {
                        Class<?> clazz = Class.forName(className);
                        Object instance = clazz.newInstance();
                        ioc.put(className,instance);
                        return instance;
                    }catch (Exception e){

                    }
                }
            }
        }
        return ioc.get(className);
    }

}
