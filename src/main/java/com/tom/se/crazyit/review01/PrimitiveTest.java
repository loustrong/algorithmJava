package com.tom.se.crazyit.review01;

/**
 * PrimitiveTest
 *
 * @author Tom on 2021/2/21
 */
public class PrimitiveTest {
    public static void main(String[] args) {
        String intStr = "123";
        int it1 = Integer.parseInt(intStr);
        int it2 = Integer.valueOf(intStr);
        String ftStr = String.valueOf(2.345f);

        Integer ina = 2;
        Integer inb = 2;
        System.out.println("ina的hashcode" + ina.hashCode() + "inb的hashcode" + inb.hashCode());
        System.out.println("ina == inb ? " + (ina == inb));
        Integer bigIna = 128;
        Integer bigInb = 128;
        System.out.println("bigIna的hashcode" + bigIna.hashCode() + "bigInb的hashcode" + bigInb.hashCode());
        System.out.println("bigIna == bigInb ? " + (bigIna == bigInb));
        int intInta = new Integer(2);
        int intIntb = new Integer(2);
        System.out.println("intInta和intIntb没有hashcode");
//        System.out.println("intInta的hashcode" + intInta. + "bigInb的hashcode" + bigInb.hashCode());
        System.out.println("intInta == intIntb ?" + (intInta == intIntb));
        Integer intIntegera = new Integer(2);
        Integer intIntegerb = new Integer(2);
        System.out.println("intIntegera的hashcode" + intIntegera.hashCode() + "intIntegerb的hashcode" + intIntegerb.hashCode());
        System.out.println("intIntegera == intIntegerb ?" + (intIntegera == intIntegerb));

    }
}
