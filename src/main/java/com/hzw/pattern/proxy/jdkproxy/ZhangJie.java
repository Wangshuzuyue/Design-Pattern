package com.hzw.pattern.proxy.jdkproxy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 16:11
 * @Description:
 */
public class ZhangJie implements Singer{
    @Override
    public int sing(String songName) {
        System.out.println("张杰演唱:" + songName);
        return 666;
    }
}
