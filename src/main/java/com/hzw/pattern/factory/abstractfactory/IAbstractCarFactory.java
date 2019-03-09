package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 15:40
 * @Description:
 */
public interface IAbstractCarFactory {

    IWheel createWheel();

    IBodywork createBodywork();

    IEngine createEngine();
}
