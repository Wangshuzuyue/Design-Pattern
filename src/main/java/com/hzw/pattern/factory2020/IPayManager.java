package com.hzw.pattern.factory2020;

/**
 * @author: huangzuwang
 * @date: 2020-02-25 20:49
 * @description: 付款管理类接口定义
 */
public interface IPayManager {

    /**
     * 支付
     * @author: huangzuwang
     * @date: 2020-02-25 21:25
     * @param password 密码
     * @return
     **/
    void pay(String password);
}
