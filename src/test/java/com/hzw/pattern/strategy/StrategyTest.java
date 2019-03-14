package com.hzw.pattern.strategy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 23:55
 * @Description:
 */
public class StrategyTest {
    public static void main(String[] args) {

//        String vehicleType = "walk";
//        IVehicle vehicle;
//        if ("walk".equals(vehicleType)){
//            vehicle = new Foot();
//        }else if ("cycling".equals(vehicleType)){
//            vehicle = new Bike();
//        }else if("driving".equals(vehicleType)){
//            vehicle = new Car();
//        }else if("flying".equals(vehicleType)){
//            vehicle = new Plane();
//        }else{
//            vehicle = new EmptyVehicle();
//        }
//        vehicle.setOut();


        TravelPlan.goToTravel("walk");
        TravelPlan.goToTravel("cycling");
        TravelPlan.goToTravel("driving");
        TravelPlan.goToTravel("flying");
        TravelPlan.goToTravel("aaaaa");
    }
}
