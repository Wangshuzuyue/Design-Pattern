package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:43
 * @Description:
 */
public class BMWBodywork implements IBodywork{
    @Override
    public void openDoor() {
        System.out.println("宝马 开车门");
    }

    @Override
    public void closeDoor() {
        System.out.println("宝马 关车门");
    }
}
