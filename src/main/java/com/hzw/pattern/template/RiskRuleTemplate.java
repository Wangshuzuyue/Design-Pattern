package com.hzw.pattern.template;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 11:31
 * @Description:
 */
public class RiskRuleTemplate {

    private RiskRuleExecutable executable;

    public RiskRuleTemplate(RiskRuleExecutable executable) {
        this.executable = executable;
    }

    private int saveResult(){
        System.out.println("保存风控结果");
        return 1;
    }

    public void fireRule(Object o){
        if (this.executable.evaluate()){
            this.executable.execute(o);
        }
        saveResult();
    }

}
