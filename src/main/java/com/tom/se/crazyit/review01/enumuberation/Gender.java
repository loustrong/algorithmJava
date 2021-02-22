package com.tom.se.crazyit.review01.enumuberation;

public enum Gender implements GenderDesc{
    /**
     *  MALE("男")
     *  FEMALE("女")
     */
    MALE("男"){
        @Override
        public void info() {
            System.out.println("I am MALE.");
        }
    },
    FEMALE("女"){
        @Override
        public void info() {
            System.out.println("I am FEMALE.");
        }
    };
    private String name;
     Gender(String name){
        this.name = name;
    }

}
