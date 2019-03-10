package com.hzw.pattern.singleton.hungry;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/10 13:56
 * @Description:
 */
public class HungryTest {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        instance.test();
    }
}
