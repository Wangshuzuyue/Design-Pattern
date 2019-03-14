package com.hzw.pattern.singleton;

/**
 * Created by Tom.
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        Thread t3 = new Thread(new ExectorThread());
        Thread t4 = new Thread(new ExectorThread());
        Thread t5 = new Thread(new ExectorThread());
        Thread t6 = new Thread(new ExectorThread());
        Thread t7 = new Thread(new ExectorThread());
        Thread t8 = new Thread(new ExectorThread());
        Thread t9 = new Thread(new ExectorThread());
        Thread t10 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        System.out.println("End");
    }
}
