package com.hzw.pattern.adapter;

import java.util.List;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 17:46
 * @Description:
 */
public interface NewRiskManager {

    /**
     * 批量准入检查
     * @param riskInfoList
     */
    void accessBatch(List<RiskInfo> riskInfoList);

    /**
     * 批量预警检查
     * @param riskInfoList
     */
    void warning(List<RiskInfo> riskInfoList);
}
