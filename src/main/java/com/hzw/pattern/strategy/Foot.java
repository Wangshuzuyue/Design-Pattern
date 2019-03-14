package com.hzw.pattern.strategy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 23:52
 * @Description:
 */
public class Foot implements IVehicle{
    @Override
    public void setOut() {
        System.out.println("步行");
    }
}
