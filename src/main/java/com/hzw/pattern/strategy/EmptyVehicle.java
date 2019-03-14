package com.hzw.pattern.strategy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 23:52
 * @Description:
 */
public class EmptyVehicle implements IVehicle{
    @Override
    public void setOut() {
        System.out.println("没有这种交通工具，您是打算自己瞬间移动吗~？");
    }
}
