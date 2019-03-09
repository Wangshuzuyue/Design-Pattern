package com.hzw.pattern.factory.simplefactory;

import com.hzw.pattern.factory.BenzCar;
import com.hzw.pattern.factory.ICar;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 13:52
 * @Description:
 */
public class SimpleFactoryTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SimpleCarFactory factory = new SimpleCarFactory();
//        ICar car = factory.createCar(BMWCar.class);
        ICar car = factory.createCar(BenzCar.class);
        car.drive();
    }
}
