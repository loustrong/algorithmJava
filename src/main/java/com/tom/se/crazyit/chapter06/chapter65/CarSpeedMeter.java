package com.tom.se.crazyit.chapter06.chapter65;

/**
 * @descriptions: CarSpeedMeter
 * @author: Tom
 * @date: 2021/1/16 下午 08:14
 * @version: 1.0
 */
public class CarSpeedMeter extends  SpeedMeter{

    private double radius;

    @Override
    public double calGirth() {
        return radius * 2 * Math.PI;
    }

    public CarSpeedMeter(double radius){
        this.radius = radius;
    }

    public static void main(String[] args) {
        CarSpeedMeter cam = new CarSpeedMeter(0.34);
        cam.setTurnRate(15);
        System.out.println(cam.getSpeed());
    }
}
