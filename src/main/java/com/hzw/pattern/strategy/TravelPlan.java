package com.hzw.pattern.strategy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 23:58
 * @Description:
 */
public class TravelPlan {


    public static void goToTravel(String vehicleType){
        IVehicle vehicle = TrafficType.getByName(vehicleType);
        if (vehicle != null){
            vehicle.setOut();
        }
    }
}
