package com.hzw.pattern.singleton.hungry;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/10 13:54
 * @Description:
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){
        //防止反射破坏单例
        if (INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

    public void test(){
        System.out.println("饿汉式测试");
    }
}
