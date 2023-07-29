
package com.mycompany.employeeobj;

public class EmployeeObj {

    public static void main(String[] args) {
        Employee obj1 = new Employee(1000000);
        obj1.setEmpName("Sadeesha");
        obj1.getEmpName();
        obj1.setSalary(750000000);
        obj1.getSalary();
        obj1.Bonus_Amount();

        System.out.println("The Employee Name is:  " +obj1.getEmpName());
        System.out.println("The Salary is: " +obj1.getSalary());
        obj1.display();
    }
}
