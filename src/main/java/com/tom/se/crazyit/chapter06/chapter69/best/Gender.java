package com.tom.se.crazyit.chapter06.chapter69.best;

public enum Gender {
    MALE("男"),FEMALE("女");
    private final String name;
    private Gender(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
