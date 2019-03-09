package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:43
 * @Description:
 */
public class BMWWheel implements IWheel{
    @Override
    public void turn() {
        System.out.println("宝马 车轮转动");
    }
}
