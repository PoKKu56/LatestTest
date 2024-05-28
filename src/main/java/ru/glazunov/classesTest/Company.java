package ru.glazunov.classesTest;

import java.util.*;

public class Company {

    public List<Employer> employers;
    private double income;

    public Company() {
        employers = new ArrayList<>();
    }

    public void hire(Employer employer) throws CreateEmployerException {
        if (employer.name.equals("")){
            throw new CreateEmployerException("Незаполнено поле name");
        }
        employers.add(employer);
    }

    public void hireAll(List<Employer> employers)throws CreateEmployerException{
        for (Employer employer : employers) {
            hire(employer);
        }
    }

    public void fire(Employer employer) throws fireEmployerException{
        if (!employers.contains(employer)){
            throw new fireEmployerException("Данный сотрудник отсутствует в базе данных");
        }
        employers.remove(employer);
    }

    public void setIncome(){
        Random rnd = new Random();
        income = rnd.nextDouble(6000000, 12000000);
    }

    public double getIncome(){
        return income;
    }

    private void sortEmployers(){
        for (int i = 0; i < employers.size() - 1; i++) {
            if (employers.get(i).getMonthlySalary(income) < employers.get(i + 1).getMonthlySalary(income)) {
                Collections.swap(employers, i, i + 1);
            }
        }
    }

    public void getTopSalaryStaff(int count){
        sortEmployers();
        System.out.println("Top " + count + " salary staff");
        for (int i = 0; i < count; i++) {
            System.out.println(employers.get(i).name + " " + employers.get(i).getMonthlySalary(income));
        }
    }

    public void getLowestSalaryStaff(int count) throws EmployerSizeException{
        if (count > employers.size()){
            throw new EmployerSizeException("Количество для вывода превышает количество сотрудников");
        }
        sortEmployers();
        System.out.println("Lowest " + count + " salary staff");
        for (int i = employers.size(), count_object = 0; count_object < count; i--, count_object++) {
            System.out.println("Lowest " + count + " salary staff");
        }
    }

}
