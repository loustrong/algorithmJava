package com.tom.se.crazyit.chapter06.chapter67;

/**
 * @descriptions: Cow
 * @author: Tom
 * @date: 2021/1/17 下午 09:09
 * @version: 1.0
 */
public class Cow {
    private double weight;
    public Cow(){}
    public Cow(double weight){
        this.weight = weight;
    }

    /**
     * 在非靜態類內部保留對內部類的引用,
     * 內部類使用private修飾,是防止外部引用
     * 如果外部類成員,內部類變量與內部類裡方法的局部變量重名
     * 則可以使用外部類類名.this作為限定來區分
     */
    private class CowLeg{
        private double length;
        private String color;
        public CowLeg(){}
        public CowLeg(double length,String color){
            this.length = length;
            this.color = color;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public void info(){
            System.out.println("當前牛腿顏色是:" + color + ", 高:" + length);
            System.out.println("奶牛的體重為:" + weight);
        }
    }
    public void test(){
        CowLeg cl = new CowLeg(1.12, "黑白相間");
        cl.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(378.9);
        cow.test();
    }
}
