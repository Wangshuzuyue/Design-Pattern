package com.hzw.pattern.factory2020;

import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:31
 * @description:
 */
public class PayTest {

    public static void main(String[] args) {
//        IPaymentFactory paymentFactory = new AliPayFactory();
//        IPaymentFactory paymentFactory = new CrossBorderPaymentFactory();
//        IPaymentFactory paymentFactory = new WeChatPayFactory();
        IPaymentFactory paymentFactory = new UnionPayFactory();

        IAccount account = paymentFactory.getAccount();
        IPayManager payManager = paymentFactory.getPayManager();
        List<IBill> bills = paymentFactory.getBills();

        System.out.println("账户余额:" + account.getBalance());
        payManager.pay("12321");
        for (IBill bill : bills){
            System.out.println( bill.read());
        }
    }
}
