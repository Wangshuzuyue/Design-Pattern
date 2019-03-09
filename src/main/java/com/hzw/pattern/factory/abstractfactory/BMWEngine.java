package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:43
 * @Description:
 */
public class BMWEngine implements IEngine{
    @Override
    public void start() {
        System.out.println("宝马 引擎启动");
    }
}
