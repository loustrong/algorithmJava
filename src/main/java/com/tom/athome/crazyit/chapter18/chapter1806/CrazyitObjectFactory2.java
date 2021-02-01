package com.tom.athome.crazyit.chapter18.chapter1806;

import javax.swing.*;
import java.util.Date;

/**
 * CrazyitObjectFactory2
 *
 * @author Tom on 2021/1/31
 */
public class CrazyitObjectFactory2 {
    public static <T> T getInstance(Class<T> cls){
        try{
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Date d = CrazyitObjectFactory2.getInstance(Date.class);
        JFrame f = CrazyitObjectFactory2.getInstance(JFrame.class);
    }
}
