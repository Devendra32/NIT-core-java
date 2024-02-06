package com.oops.encapsulation;

import java.util.Scanner;

public class ClassB {
    public void meth1(){
        ClassA aobj=new ClassA();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp name : ");
        aobj.setEmpName(sc.next());

        System.out.println("Enter emp experience : ");
        aobj.setExperience(sc.nextInt());

        System.out.println("Enter emp salary : ");
        aobj.setSalary(sc.nextDouble());

        System.out.println("Employee Name :"+aobj.getEmpName());
        System.out.println("Employee Experience :"+aobj.getExperience()+" Years");
        System.out.println("Updated Salary :"+aobj.getSalary());
        sc.close();
    }

    public static void main(String[] args) {
        new ClassB().meth1();
    }
}
