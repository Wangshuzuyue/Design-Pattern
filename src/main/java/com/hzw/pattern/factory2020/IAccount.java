package com.hzw.pattern.factory2020;

import java.math.BigDecimal;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 20:59
 * @description: 账户
 */
public interface IAccount {

    /**
     * 获取账户余额
     * @return
     */
    BigDecimal getBalance();

}
