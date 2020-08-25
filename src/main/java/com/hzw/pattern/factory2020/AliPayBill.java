package com.hzw.pattern.factory2020;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:28
 * @description:
 */
public class AliPayBill implements IBill{

    @Override
    public String read() {
        return "支付宝账单: 支出 100元";
    }
}
