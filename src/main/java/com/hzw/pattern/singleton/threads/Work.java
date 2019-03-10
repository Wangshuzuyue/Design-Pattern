package com.hzw.pattern.singleton.threads;

import com.hzw.pattern.singleton.hungry.HungrySingleton;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/10 14:13
 * @Description:
 */
public class Work implements Runnable{
    @Override
    public void run() {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":::" + instance);
    }
}
