package com.tom.se.crazyit.review01.serialize;

import java.io.*;

/**
 * @descriptions: WriterAndReadObject
 * @author: Tom
 * @date: 2021/2/27 下午 05:03
 * @version: 1.0
 */
public class WriteAndReadTeacher {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("mutable.txt")
                );
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("mutable.txt")
                )
                ){
            Person person = new Person("孫悟空",500);
            oos.writeObject(person);
            person.setName("豬八戒");
            oos.writeObject(person);
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();
            System.out.println(p1 == p2);
            System.out.println(p2.getName());
        }
    }
}
