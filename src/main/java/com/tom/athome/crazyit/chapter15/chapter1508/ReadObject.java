package com.tom.athome.crazyit.chapter15.chapter1508;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ReadObject
 *
 * @author Tom on 2021/1/21
 */
public class ReadObject {
    public static void main(String[] args) {
        try(
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("object.txt")
                )
                ){
            Person p = (Person) ois.readObject();
            System.out.println("名字为：" + p.getName() +",年龄为:" + p.getAge());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
