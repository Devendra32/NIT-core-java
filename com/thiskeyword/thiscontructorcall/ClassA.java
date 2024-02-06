package com.thiskeyword.thiscontructorcall;

public class ClassA {
    void meth1(){
        //this(); //C.E. because this() can be used only inside a constructor
        System.out.println("meth1() called:");
    }
    ClassA(){
        this("java is awesome");
        System.out.println("default constructor");
    }
    ClassA(int a){
        this();
        System.out.println("parameterized constructor"+a);
        //new ClassA();
        //this() //C.E because this() should be the 1st statement inside a constructor
    }
    ClassA(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        new ClassA(500).meth1();
    }
}
