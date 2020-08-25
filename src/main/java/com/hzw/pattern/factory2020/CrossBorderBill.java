package com.hzw.pattern.factory2020;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:28
 * @description:
 */
public class CrossBorderBill implements IBill{

    @Override
    public String read() {
        return "跨境账单: 支出 200元";
    }
}
