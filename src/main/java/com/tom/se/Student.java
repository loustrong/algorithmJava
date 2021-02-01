package com.tom.se;

/**
 * @descriptions: Student
 * @author: Tom
 * @date: 2020/12/15 下午 07:09
 * @version: 1.0
 */
public class Student {
    private int id;
    private String name;
    private java.util.Date dateCreate;
    public Student(int ssn, String newName){
        id = ssn;
        name = newName;
        dateCreate = new java.util.Date();
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public java.util.Date getDateCreate(){
        return dateCreate;
    }
}
