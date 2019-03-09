package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:50
 * @Description:
 */
public class BMWFactory implements IAbstractCarFactory{
    @Override
    public IWheel createWheel() {
        return new BMWWheel();
    }

    @Override
    public IBodywork createBodywork() {
        return new BMWBodywork();
    }

    @Override
    public IEngine createEngine() {
        return new BMWEngine();
    }
}
