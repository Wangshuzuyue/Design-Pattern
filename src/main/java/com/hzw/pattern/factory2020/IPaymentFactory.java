package com.hzw.pattern.factory2020;

import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 20:54
 * @description: 支付方式工厂接口
 */
public interface IPaymentFactory {

    /**
     * 获取支付管理类
     * @return
     */
    IPayManager getPayManager();

    /**
     * 获取账户实体
     * @return
     */
    IAccount getAccount();

    /**
     * 获取账单列表
     * @return
     */
    List<IBill> getBills();

}
