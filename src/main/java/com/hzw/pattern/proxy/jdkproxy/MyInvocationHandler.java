package com.hzw.pattern.proxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 15:55
 * @Description:
 */
public interface MyInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
