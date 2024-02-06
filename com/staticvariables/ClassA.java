package com.staticvariables;

public class ClassA {
    int a; //instance variable
    static int b; //static keyword

    ClassA(){
        a++;
        b++;
        System.out.println("instance variable :"+a);
        System.out.println("static variable :"+b);
        System.out.println("-------------------------");

    }

    public static void main(String[] args) {
        new ClassA();
        new ClassA();
        new ClassA();
    }
}
