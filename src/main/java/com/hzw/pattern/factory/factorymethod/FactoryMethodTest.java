package com.hzw.pattern.factory.factorymethod;

import com.hzw.pattern.factory.ICar;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 13:52
 * @Description:
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        BenzCarFactory factory = new BenzCarFactory();
//        BMWCarFactory factory = new BMWCarFactory();
        ICar car = factory.createCar();
        car.drive();
    }
}
