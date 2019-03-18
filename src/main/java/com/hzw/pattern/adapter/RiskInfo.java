package com.hzw.pattern.adapter;

import java.math.BigDecimal;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 17:48
 * @Description:
 */
public class RiskInfo {
    private Integer age;
    private BigDecimal balance;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "RiskInfo{" +
                "age='" + age + '\'' +
                ", balance=" + balance +
                '}';
    }
}
