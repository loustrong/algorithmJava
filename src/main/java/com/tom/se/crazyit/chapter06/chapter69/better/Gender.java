package com.tom.se.crazyit.chapter06.chapter69.better;

public enum  Gender {
    MALE, FEMALE;
    private String name;
    public void setName(String name){
        switch (this){
            case MALE:
                if(name.equals("男")){
                    this.name = name;
                } else{
                    System.out.println("參數錯誤");
                    return;
                }
                break;
            case FEMALE:
                if(name.equals("女")){
                    this.name = name;
                } else{
                    System.out.println("參數錯誤");
                    return;
                }
                break;
            default:
                System.out.println("ERROR!");;
        }
    }
    public String getName(){
        return this.name;
    }
}
