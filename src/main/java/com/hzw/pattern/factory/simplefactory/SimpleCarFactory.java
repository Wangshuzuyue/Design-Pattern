package com.hzw.pattern.factory.simplefactory;

import com.hzw.pattern.factory.ICar;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:03
 * @Description:
 */
public class SimpleCarFactory{
    public ICar createCar(Class<? extends ICar> clazz) throws IllegalAccessException, InstantiationException {
        if (clazz != null){
            return clazz.newInstance();
        }
        return null;
    }
}
