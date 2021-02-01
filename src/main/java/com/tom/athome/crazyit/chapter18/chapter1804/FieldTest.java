package com.tom.athome.crazyit.chapter18.chapter1804;

import java.lang.reflect.Field;

/**
 * FieldTest
 *
 * @author Tom on 2021/1/31
 */
public class FieldTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person();
        Class<Person> personClazz = Person.class;
        Field nameField = personClazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p, "Yeeku.H.Lee");
        Field ageField = personClazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.setInt(p,30);
        System.out.println(p);

    }
}

class Person{
    private String name;
    private int age;
    public String toString(){
        return "Person[name:" + name + ", age:" + age + "]";
    }
}