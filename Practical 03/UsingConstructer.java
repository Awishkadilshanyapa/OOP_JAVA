
package com.mycompany.constructertest;

public class UsingConstructer {
      // data
    private int age,salary;
    private String name;

    //method - constructer - in constructer  name should be same as the main class
    public UsingConstructer(int thisage, int thissalary, String thisname)
    {
        age=thisage;
        salary=thissalary;
        name=thisname;

    }

    public void display()
    {
        System.out.println("The age is: "+age);
        System.out.println("Thw Salary is: " +salary);
        System.out.println("The Name is: "+name);
    }
}
