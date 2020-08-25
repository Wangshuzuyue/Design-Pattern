package com.hzw.pattern.factory2020;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:29
 * @description:
 */
public class UnionPayManager implements IPayManager{

    @Override
    public void pay(String password) {
        System.out.println("银联支付: 400元");
    }
}
