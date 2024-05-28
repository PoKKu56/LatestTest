package ru.glazunov.classesTest;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import java.lang.constant.Constable;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void hireExceptionTest_1() throws CreateEmployerException {
        CreateEmployerException exception = assertThrows(CreateEmployerException.class, () -> {
            Employer new_employer = new Manager("");
            Company company = new Company();
            company.hire(new_employer);
        });
        assertTrue(exception.getMessage().contains("Незаполнено поле name"));
    }


    @Test
    void fire() throws fireEmployerException{
        fireEmployerException exception = assertThrows(fireEmployerException.class, () -> {
            Employer new_employer = new Manager("Rodion");
            Employer new_employer2 = new Manager("Dima");
            Company company = new Company();
            company.fire(new_employer2);
        });
        assertTrue(exception.getMessage().contains("Данный сотрудник отсутствует в базе данных"));
    }
}