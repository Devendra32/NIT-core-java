package com.staticvariables.staticblock;

public class ClassB {
    static int a=meth1();
    static int b=meth2();
    static int meth1(){
        System.out.println("static meth1() called :");
        return 100;
    }
    static int meth2(){
        System.out.println("static meth2() called :");
        return 200;
    }
    static {
        System.out.println("1st static block :"+a);
    }

    public static void main(String[] args) {
        System.out.println("main() called :"+(a+b));
    }
    static {
        System.out.println("2nd static block :"+b);
    }
}

/*
       For static variables and static blocks, we will be having equal priorities.
       They will be executed in the defined order [even before main()].
*/
