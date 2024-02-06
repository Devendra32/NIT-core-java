package com.oops.encapsulation;

public class ClassA {
    private String empName;
    private int experience;
    private double salary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        if(experience>=10)
        {
            salary+=salary*0.10;
        }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
