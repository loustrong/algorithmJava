package com.tom.se.crazyit.review01.serialize;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.io.Serializable;

/**
 * @descriptions: Person
 * @author: Tom
 * @date: 2021/2/27 下午 04:34
 * @version: 1.0
 */
public class Person
implements Serializable {
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return "{Person(name: + " + this.name+ ", age:"+this.age+ ")}";
    }
    @Override
    public boolean equals(Object o){
        if(o == this){
           return true;
        }
        if(o!= null && o.getClass() == Person.class){
           return (((Person) o).getAge()== this.getAge() )&& (((Person) o).getName() == this.getName());


        }
        return false;
    }
}
