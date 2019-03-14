package com.hzw.pattern.proxy;

import com.hzw.pattern.proxy.jdkproxy.Singer;
import com.hzw.pattern.proxy.jdkproxy.SingerBroker;
import com.hzw.pattern.proxy.jdkproxy.ZhangJie;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 17:56
 * @Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        Singer singer = (Singer) new SingerBroker().getProxyInstance(new ZhangJie());
        int result = singer.sing("明天过后");
        System.out.println("打Call！" + result);
    }
}
