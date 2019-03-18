package com.hzw.pattern.template;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 16:15
 * @Description:
 */
public class TemplateTest {

    public static void main(String[] args) {

        RiskRuleTemplate template = new RiskRuleTemplate(new AgeRule());
        template.fireRule(16);
    }
}
