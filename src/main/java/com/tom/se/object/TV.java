package com.tom.se.object;

/**
 * @descriptions: tv class
 * @author: Tom
 * @date: 2020/12/29 下午 11:13
 * @version: 1.0
 */
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    public TV(){}
    public void turnOn(){
        this.on = true;
    }
    public void turnOff(){
        this.on = false;
    }
    public void setChannel(int newChannel){
        if(on && newChannel >=1 && newChannel <=120){
            channel = newChannel;
        }
    }
    public void setVolume(int newVolumeLevel){
            if(on && newVolumeLevel >=1 && newVolumeLevel <=7){
                volumeLevel = newVolumeLevel;
            }
        }
    public void channelUp(){
        if(on && channel < 120) {
            channel ++;
        }
    }
    public void channelDown(){
        if(on && channel > 1){
            channel--;
        }
    }
    public void volumeUp(){
            if(on && volumeLevel < 7){
                volumeLevel++;
            }
        }
    public void volumeDown(){
        if(on && volumeLevel > 1){
            volumeLevel --;
        }
    }




}
