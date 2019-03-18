package com.hzw.pattern.template;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 16:13
 * @Description:
 */
public class AgeRule implements RiskRuleExecutable<Integer>{

    @Override
    public boolean evaluate() {
        return true;
    }

    @Override
    public void execute(Integer age) {
        if (age < 18){
            System.out.println("年龄小于18的风控不通过");
        }else{
            System.out.println("年龄大于等于18，通过");
        }
    }
}
