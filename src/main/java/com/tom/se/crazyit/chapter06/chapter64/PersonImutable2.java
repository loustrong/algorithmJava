package com.tom.se.crazyit.chapter06.chapter64;

/**
 * @descriptions: PersonImutable
 * @author: Tom
 * @date: 2021/1/16 下午 04:14
 * @version: 1.0
 */
public class PersonImutable2 {
    private final Name2 name;

    public PersonImutable2(Name2 name) {
//        this.name = name;
        this.name = new Name2(name.getFirstName(), name.getLastName());
    }

    public Name2 getName() {
        return name;
    }

    public static void main(String[] args) {
        Name2 n = new Name2("悟空","孫");
        PersonImutable2 p = new PersonImutable2(n);
        System.out.println(p.getName().getFirstName());
        n.setFirstName("八戒");
        System.out.println(p.getName().getFirstName());

    }
}

class Name2{
    private String firstName;
    private String lastName;

    public Name2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
