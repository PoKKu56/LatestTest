package ru.glazunov.classesTest;

import java.util.Random;

public class Operator extends Employer{

    public Operator(String name) {
        super(name);
    }

    public double getMonthlySalary(double income) {
        return salary;
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
