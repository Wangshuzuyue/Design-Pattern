package com.hzw.pattern.singleton.lazy.doublecheck;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 20:26
 * @Description:
 */
public class DoubleCheckLazySingleton {

    private static DoubleCheckLazySingleton INSTANCE = null;

    private DoubleCheckLazySingleton(){
        //防止反射破坏单例
        if (INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static DoubleCheckLazySingleton getInstance(){
        //外层判断用以提高效率【避免多个线程同步进行判断】
        if (INSTANCE == null){
            synchronized (DoubleCheckLazySingleton.class){
                //内层判断用于防止多个线程同时通过外层判断之后，先后生成多个实例
                if (INSTANCE == null){
                    INSTANCE = new DoubleCheckLazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
