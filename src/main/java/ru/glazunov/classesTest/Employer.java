package ru.glazunov.classesTest;

public abstract class Employer {
    public String name;
    public int salary;

    public Employer(String name) {
        this.name = name;
    }

    public Employer() {}

    public double getMonthlySalary(double income){
        return 0;
    };

    public int generateSalary(){
        return 0;
    };

}
