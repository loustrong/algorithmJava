package com.tom.se.crazyit.chapter06.chapter67;

/**
 * @descriptions: DiscernVariable
 * @author: Tom
 * @date: 2021/1/17 下午 09:23
 * @version: 1.0
 */
public class DiscernVariable {
    private String prop = "外部類的實例變量";
    private class InnerClass{
        String prop = "局部變量";
        public void info(){
            String prop = "局部變量";
            System.out.println("外部類的實例變量值:"+DiscernVariable.this.prop);
            System.out.println("內部類的實例變量值:" + this.prop);
            System.out.println("局部變量的值:" + prop);
        }
    }
    public void test(){
        InnerClass in = new InnerClass();
        in.info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}
