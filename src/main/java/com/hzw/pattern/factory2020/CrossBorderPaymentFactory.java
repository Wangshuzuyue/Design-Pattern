package com.hzw.pattern.factory2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:49
 * @description:
 */
public class CrossBorderPaymentFactory implements IPaymentFactory{
    @Override
    public IPayManager getPayManager() {
        return new CrossBorderPayManager();
    }

    @Override
    public IAccount getAccount() {
        return new CrossBorderAccount();
    }

    @Override
    public List<IBill> getBills() {
        List<IBill> billList = new ArrayList<>();
        billList.add(new CrossBorderBill());
        return billList;
    }
}
