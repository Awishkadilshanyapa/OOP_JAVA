
package com.mycompany.employeetest;

public class EmployeeTest {

    public static void main(String[] args) {
        // Creating two Employee objects
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        // Setting values using setters
        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

        msBird.setEmpID(102);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("Data Scientist");

        // Printing the details using getters
        System.out.println("Employee Details for Mr. Bogdan:");
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println("\nEmployee Details for Ms. Bird:");
        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}

