package com.hzw.pattern.proxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * 歌手经纪人
 * @Auther: huangzuwang
 * @Date: 2019/3/14 17:49
 * @Description:
 */
public class SingerBroker implements MyInvocationHandler{

    Object target;
    public Object getProxyInstance(Class<?> clazz) throws IllegalAccessException, InstantiationException {
        this.target = clazz.newInstance();
        Object o = MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
        return o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("卖门票");
        Object result = method.invoke(this.target, args);
        System.out.println("安排签名会");
        return result;
    }
}
