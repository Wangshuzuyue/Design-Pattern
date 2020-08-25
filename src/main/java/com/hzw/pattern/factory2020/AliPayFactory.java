package com.hzw.pattern.factory2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:09
 * @description:
 */
public class AliPayFactory implements IPaymentFactory{

    @Override
    public IPayManager getPayManager() {
        return new AliPayManager();
    }

    @Override
    public IAccount getAccount() {
        return new AliPayAccount();
    }

    @Override
    public List<IBill> getBills() {
        List<IBill> billList = new ArrayList<>();
        billList.add(new AliPayBill());
        return billList;
    }
}
