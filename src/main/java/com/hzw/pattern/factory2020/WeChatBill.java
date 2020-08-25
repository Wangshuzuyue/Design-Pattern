package com.hzw.pattern.factory2020;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:28
 * @description:
 */
public class WeChatBill implements IBill{

    @Override
    public String read() {
        return "微信账单: 支出 300元";
    }
}
