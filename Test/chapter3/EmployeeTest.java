package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
        Employee employee1;
        Employee employee2;
    @BeforeEach
    void setUp(){
      employee1 = new Employee("Hadiza", "Umar", 50_000.00);
        employee2 = new Employee("Miracle", "Umar", 70_000.00);
    }
    @Test
    void testThatWehaveAnEmplyee(){
        //given that employee exists
        //check that employee is Hadiza
        assertNotNull(employee1);
        assertEquals("Umar", employee1.getLastName());
    }

    @Test
    void testThatEmployeeHaSalary(){
        //given that emlpoyee exist
        //check employee has salary
        assertEquals(50_000.00, employee1.getMonthlySalary());

    }

    @Test
    void testThatEmployeeSalaryIsNotNegative(){
        employee1.setMonthlySalary(-5000.00);
        assertEquals(50_000.00, employee1.getMonthlySalary());
    }

    @Test
    void checkForEmployeeyearlySalary(){
        employee1.setMonthlySalary(50_000.00);
        employee2.setMonthlySalary(70_000.00);
        employee1.getYearlySalary();
        employee2.getYearlySalary();
        assertEquals(600_000.00,employee1.getYearlySalary());
        assertEquals(840_000.00,employee2.getYearlySalary());
    }

    @Test
    void increaseYearlySalary(){
        assertEquals(660_000,employee1.getIncrement());
    }



}