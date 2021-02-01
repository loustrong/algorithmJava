package com.tom.athome.crazyit.chapter15.chapter1508;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * WriteObject
 *
 * @author Tom on 2021/1/21
 */
public class WriteObject {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("object.txt")
        )){
            Person per = new Person("孙悟空", 500);
            oos.writeObject(per);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }
}
