package com.tom.se.crazyit.chapter06.chapter65;

/**
 * @descriptions: SpeedMeter
 * @author: Tom
 * @date: 2021/1/16 下午 08:11
 * @version: 1.0
 */
public abstract class SpeedMeter {
    private double turnRate;
    public SpeedMeter(){}
    public abstract double calGirth();
    public void setTurnRate(double turnRate){
        this.turnRate = turnRate;
    }
    public double getSpeed(){
        return calGirth() * turnRate;
    }
}
