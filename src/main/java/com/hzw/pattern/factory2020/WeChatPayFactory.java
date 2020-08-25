package com.hzw.pattern.factory2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:09
 * @description:
 */
public class WeChatPayFactory implements IPaymentFactory{

    @Override
    public IPayManager getPayManager() {
        return new WeChatManager();
    }

    @Override
    public IAccount getAccount() {
        return new WeChatAccount();
    }

    @Override
    public List<IBill> getBills() {
        List<IBill> billList = new ArrayList<>();
        billList.add(new WeChatBill());
        return billList;
    }
}
