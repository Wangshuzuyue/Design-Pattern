package com.hzw.pattern.factory.factorymethod;

import com.hzw.pattern.factory.BMWCar;
import com.hzw.pattern.factory.ICar;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:08
 * @Description:
 */
public class BMWCarFactory implements ICarFactory{
    @Override
    public ICar createCar() {
        return new BMWCar();
    }
}
