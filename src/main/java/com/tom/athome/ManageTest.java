package com.tom.athome;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Manager Test
 *
 * @author Tom on 2021/1/1
 */
public class ManageTest {
    public static void main(String[] args) {
        // consruct a manager object
        Manager boss = new Manager("Carl Cracker",80000,1987, 1,1);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Test", 40000, 1990, 3, 15);
        Arrays.sort(staff);
        for(Employee e: staff){
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }

}
class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += salary * byPercent;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
class Manager extends Employee{

    private double bonus;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double e){
        bonus = e;
    }
}