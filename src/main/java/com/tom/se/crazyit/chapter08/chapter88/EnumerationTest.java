package com.tom.se.crazyit.chapter08.chapter88;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * @descriptions: EnumerationTest
 * @author: Tom
 * @date: 2021/1/19 下午 11:20
 * @version: 1.0
 */
public class EnumerationTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("瘋狂Java講義");
        v.add("輕量級Java EE企業應用實戰");
        Hashtable scores = new Hashtable();
        scores.put("語文", 78);
        scores.put("數學", 88);
        Enumeration em = v.elements();
        while(em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
        Enumeration keyEm = scores.keys();
        while(keyEm.hasMoreElements()){
            Object key = keyEm.nextElement();
            System.out.println(key + "----->" + scores.get(key));
        }
    }
}
