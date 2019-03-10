package com.hzw.pattern.singleton.lazy.innerclass;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 20:26
 * @Description:
 */
public class StaticInnerClassLazySingleton {

    private StaticInnerClassLazySingleton(){
        //防止反射破坏单例
        if (Holder.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * 注意加final
     * @return
     */
    public final StaticInnerClassLazySingleton  getInstance(){
        return Holder.INSTANCE;
    }


    private static final class Holder{
        private static final StaticInnerClassLazySingleton INSTANCE = new StaticInnerClassLazySingleton();
    }
}
