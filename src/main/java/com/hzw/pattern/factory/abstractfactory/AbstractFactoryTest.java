package com.hzw.pattern.factory.abstractfactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/9 13:52
 * @Description:
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
//        IAbstractCarFactory factory = new BMWFactory();
        IAbstractCarFactory factory = new BenzFactory();

        IEngine engine = factory.createEngine();
        IWheel wheel = factory.createWheel();
        IBodywork bodywork = factory.createBodywork();

        bodywork.openDoor();
        bodywork.closeDoor();
        engine.start();
        wheel.turn();
    }
}
