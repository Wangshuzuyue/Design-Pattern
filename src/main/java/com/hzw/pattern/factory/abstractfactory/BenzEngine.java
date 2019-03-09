package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:43
 * @Description:
 */
public class BenzEngine implements IEngine{
    @Override
    public void start() {
        System.out.println("奔驰 引擎启动");
    }
}
