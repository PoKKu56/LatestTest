package ru.glazunov.classesTest;

import java.util.Random;

public class Manager extends Employer{
    private String name;
    private int salary;

    public Manager(String name) {
        super(name);
    }

    public Manager() {
        super();
    };

    public double getMonthlySalary(double income) {
        return salary + (income * 0.05);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int generateSalary() {
        Random r = new Random();
        return r.nextInt(115000, 140000);
    }
}
