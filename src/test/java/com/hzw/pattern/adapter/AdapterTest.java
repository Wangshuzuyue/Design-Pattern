package com.hzw.pattern.adapter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/18 18:42
 * @Description:
 */
public class AdapterTest {
    public static void main(String[] args) {
        RiskManagerAdapter riskManagerAdapter = new RiskManagerAdapter(new OldRiskManagerImpl());
        List<RiskInfo> riskInfos = new ArrayList<>();
        RiskInfo riskInfo1 = new RiskInfo();
        riskInfo1.setAge(17);
        riskInfo1.setBalance(new BigDecimal("10000"));

        RiskInfo riskInfo2 = new RiskInfo();
        riskInfo2.setAge(25);
        riskInfo2.setBalance(new BigDecimal("50000"));
        riskInfos.add(riskInfo1);
        riskInfos.add(riskInfo2);
        riskManagerAdapter.accessBatch(riskInfos);
        riskManagerAdapter.warning(riskInfos);
    }
}
