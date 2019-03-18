package com.hzw.pattern.adapter;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 17:56
 * @Description:
 */
public class OldRiskManagerImpl implements OldRiskManager{
    @Override
    public void access(RiskInfo riskInfo) {
        System.out.println("进行准入检查：" + riskInfo);
    }
}
