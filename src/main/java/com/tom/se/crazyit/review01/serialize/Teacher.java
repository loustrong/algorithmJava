package com.tom.se.crazyit.review01.serialize;

import java.io.Serializable;
import java.util.Objects;

/**
 * @descriptions: Teacher
 * @author: Tom
 * @date: 2021/2/27 下午 04:59
 * @version: 1.0
 */
public class Teacher implements Serializable {
    private String name;
    private Person student;
    public Teacher(String name, Person student){
        this.name = name;
        this.student = student;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return getName().equals(teacher.getName()) &&
                getStudent().equals(teacher.getStudent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudent());
    }
}
