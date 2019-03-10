package com.hzw.pattern;


import com.hzw.pattern.singleton.lazy.doublecheck.DoubleCheckLazySingleton;

/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        DoubleCheckLazySingleton singleton = DoubleCheckLazySingleton.getInstance();
//        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
