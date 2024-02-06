package com.staticvariables.staticblock;

public class ClassA {
    final static int i;
    void meth1(){
        //i=50; //C.E. //we can not initialize a final static variable inside a normal method.
    }
    static void meth2(){
        //i=50; //C.E. //we can not initialize a final static variable inside a static method.
    }
    static {
        i=50;
        System.out.println("1st static block :"+i);
    }

    public static void main(String[] args) {
        System.out.println("main() called :"+i);
    }
    static {
//        i=45; //C.E. //Final variables are constants
        System.out.println("2nd static block :"+i);
    }
}
