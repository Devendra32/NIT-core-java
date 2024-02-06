package com.constructor;

public class ClassA {
    String studentName;
    int studentId;
    String studentDept;

    ClassA(String name, int id, String dept){
        studentName=name;
        studentId=id;
        studentDept=dept;
    }

    public static void main(String[] args) {
        ClassA aobj1=new ClassA("Ram",101,"MCA");
        ClassA aobj2=new ClassA("Raheem",102,"Btech");
        ClassA aobj3=new ClassA("Shyam",103,"Be");

        System.out.println(aobj1.studentName+" "+aobj1.studentId+" "+aobj1.studentDept);
        System.out.println(aobj2.studentName+" "+aobj2.studentId+" "+aobj2.studentDept);
        System.out.println(aobj3.studentName+" "+aobj3.studentId+" "+aobj3.studentDept);
    }

}

/*
     Instance variables for every instance/object a separate copy will be created
        (or)
     For every instance/object a separate copy of instance variable will be created

 */