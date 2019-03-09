package com.hzw.pattern.factory.factorymethod;

import com.hzw.pattern.factory.BenzCar;
import com.hzw.pattern.factory.ICar;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:08
 * @Description:
 */
public class BenzCarFactory implements ICarFactory{
    @Override
    public ICar createCar() {
        return new BenzCar();
    }
}
