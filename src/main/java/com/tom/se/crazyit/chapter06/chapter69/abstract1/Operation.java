package com.tom.se.crazyit.chapter06.chapter69.abstract1;

/**
 * @descriptions: abstarctOperation
 * @author: Tom
 * @date: 2021/1/18 下午 02:03
 * @version: 1.0
 */
public enum Operation {
    PLUS{
        @Override
        public double eval(double x, double y){
            return x + y;
        }
    },
    MINUS{
        @Override
        public double eval(double x, double y){
            return x -y;
        }
    },
    TIMES{
        @Override
        public double eval(double x, double y){
            return x*y;
        }
    },
    DIVIDE{
        @Override
        public double eval(double x, double y){
            return x/y;
        }
    };
    public abstract double eval(double x, double y);

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(3,4));
        System.out.println(Operation.MINUS.eval(3,4));
        System.out.println(Operation.TIMES.eval(3,4));
        System.out.println(Operation.DIVIDE.eval(3,4));
    }
}
