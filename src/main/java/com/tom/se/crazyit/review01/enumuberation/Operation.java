package com.tom.se.crazyit.review01.enumuberation;

import java.sql.SQLOutput;

public enum Operation {
    /**
     *
     */
    PLUS{
        @Override
        public double eval(double x, double y){
            return x + y;
        }
    };
    public abstract double eval(double x, double y);

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(3,4));
    }
}
