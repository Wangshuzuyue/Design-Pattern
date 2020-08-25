package com.hzw.pattern.factory2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:09
 * @description:
 */
public class UnionPayFactory implements IPaymentFactory{

    @Override
    public IPayManager getPayManager() {
        return new UnionPayManager();
    }

    @Override
    public IAccount getAccount() {
        return new UnionPayAccount();
    }

    @Override
    public List<IBill> getBills() {
        List<IBill> billList = new ArrayList<>();
        billList.add(new UnionPayBill());
        return billList;
    }
}
