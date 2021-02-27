package com.tom.se.crazyit.review01.serialize;

import java.io.*;

/**
 * @descriptions: WriteObject
 * @author: Tom
 * @date: 2021/2/27 下午 04:43
 * @version: 1.0
 */
public class WriteObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))
        ) {
            Person p = new Person("孫悟空", 100);
            oos.writeObject(p);
        }
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"))
                ){
            Person p = (Person)ois.readObject();
            System.out.println("名字為:" + p.getName() + "\n年齡為:" + p.getAge());
        }
    }
}
