package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:50
 * @Description:
 */
public class BenzFactory implements IAbstractCarFactory{
    @Override
    public IWheel createWheel() {
        return new BenzWheel();
    }

    @Override
    public IBodywork createBodywork() {
        return new BenzBodywork();
    }

    @Override
    public IEngine createEngine() {
        return new BenzEngine();
    }
}
