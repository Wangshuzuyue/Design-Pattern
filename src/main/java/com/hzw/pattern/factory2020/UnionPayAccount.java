package com.hzw.pattern.factory2020;

import java.math.BigDecimal;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 21:27
 * @description:银联支付
 */
public class UnionPayAccount implements IAccount{
    @Override
    public BigDecimal getBalance() {
        return new BigDecimal("40000");
    }
}
