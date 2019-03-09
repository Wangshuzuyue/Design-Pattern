package com.hzw.pattern.factory;

import com.hzw.pattern.factory.ICar;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:00
 * @Description:
 */
public class BMWCar implements ICar{
    @Override
    public void drive() {
        System.out.println("开宝马");
    }
}
