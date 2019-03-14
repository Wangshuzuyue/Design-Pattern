package com.hzw.pattern.strategy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/14 23:45
 * @Description:
 */
public enum TrafficType {

    WALK("walk", new Foot()),
    CYCLING("cycling", new Bike()),
    DRIVING("driving", new Car()),
    FLYING("flying", new Plane()),
    EMPTY("empty", new EmptyVehicle());

    String name;

    IVehicle vehicle;

    TrafficType(String name, IVehicle vehicle){
        this.name = name;
        this.vehicle = vehicle;
    }

    public IVehicle getVehicle(){
        return vehicle;
    }

    public static IVehicle getByName(String name){
        for(TrafficType trafficType : TrafficType.values()){
            if (trafficType.name.equals(name)){
                return trafficType.getVehicle();
            }
        }
        return TrafficType.EMPTY.getVehicle();
    }
}
