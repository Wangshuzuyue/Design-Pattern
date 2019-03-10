package com.hzw.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 20:26
 * @Description:
 */
public class SeriableSingleton implements Serializable{

    private volatile static SeriableSingleton INSTANCE = null;

    private SeriableSingleton(){
        //防止反射破坏单例
        if (INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static SeriableSingleton getInstance(){
        //外层判断用以提高效率【避免多个线程同步进行判断】
        if (INSTANCE == null){
            synchronized (SeriableSingleton.class){
                //内层判断用于防止多个线程同时通过外层判断之后，先后生成多个实例
                if (INSTANCE == null){
                    INSTANCE = new SeriableSingleton();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * 重写该方法，防止序列化破坏单例
     * @return
     */
    private  Object readResolve(){
        return  INSTANCE;
    }
}
