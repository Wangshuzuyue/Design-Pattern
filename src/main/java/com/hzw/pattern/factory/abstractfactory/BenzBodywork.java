package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:43
 * @Description:
 */
public class BenzBodywork implements IBodywork{
    @Override
    public void openDoor() {
        System.out.println("奔驰 开车门");
    }

    @Override
    public void closeDoor() {
        System.out.println("奔驰 关车门");
    }
}
