package ru.glazunov.classesTest;

import java.util.Random;

public class TopManager extends Employer{

    public TopManager(String name) {
        super(name);
    }

    public double getMonthlySalary(double income) {
        if (income > 1000000){
            return this.salary * (salary * 1.5);
        }
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
