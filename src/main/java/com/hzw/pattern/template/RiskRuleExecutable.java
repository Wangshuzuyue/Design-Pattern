package com.hzw.pattern.template;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 11:28
 * @Description:
 */
public interface RiskRuleExecutable<T> {

    /**
     * 评估是否执行
     * @return
     */
    boolean evaluate();

    /**
     * 执行
     */
    void execute(T t);


}
