package com.tom.se.crazyit.review01.enumuberation;

public enum SeasonEnum {
    /**
     * SPRING("春天")
     * SUMMER("夏天")
     * FALL("秋天")
     * WINTER("冬天")
     */
    SPRING("春天"),SUMMER("夏天"), FALL("秋天"), WINTER("冬天");
    public final String name;
    private SeasonEnum(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
