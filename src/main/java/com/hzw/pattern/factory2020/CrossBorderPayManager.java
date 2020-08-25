package com.hzw.pattern.factory2020;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:29
 * @description:
 */
public class CrossBorderPayManager implements IPayManager{

    @Override
    public void pay(String password) {
        System.out.println("跨境支付: 100元");
    }
}
