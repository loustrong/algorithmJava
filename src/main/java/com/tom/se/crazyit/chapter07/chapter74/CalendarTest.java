package com.tom.se.crazyit.chapter07.chapter74;

import java.util.Calendar;

import static java.util.Calendar.YEAR;

/**
 * @descriptions: CalendarTest
 * @author: Tom
 * @date: 2021/1/18 下午 10:14
 * @version: 1.0
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        c.set(2003, 10, 23, 12,32,23);
        c.add(YEAR,-1);
        c.roll(Calendar.MONTH,-8);
    }
}
