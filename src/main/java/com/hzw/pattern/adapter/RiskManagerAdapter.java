package com.hzw.pattern.adapter;

import java.util.List;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 17:54
 * @Description:
 */
public class RiskManagerAdapter implements NewRiskManager{

    private OldRiskManager oldRiskManager;


    public RiskManagerAdapter(OldRiskManager oldRiskManager) {
        this.oldRiskManager = oldRiskManager;
    }

    @Override
    public void accessBatch(List<RiskInfo> riskInfoList) {
        System.out.println("进行批量准入检查:" + riskInfoList);
        for (RiskInfo riskInfo : riskInfoList){
            oldRiskManager.access(riskInfo);
        }
    }

    @Override
    public void warning(List<RiskInfo> riskInfoList) {
        System.out.println("进行批量预警检查:" + riskInfoList);
    }
}
