package com.thiskeyword;

public class ClassA {
    ClassA meth1(){
        System.out.println("meth1() called");
//        return new ClassA();
        return this;
    }
    ClassA meth2(){
        System.out.println("meth2() called");
//        return new ClassA();
        return this;
    }
    int meth3(){
        System.out.println("meth3() called");
        return 99;
    }

    public static void main(String[] args) {
        int result = new ClassA().meth1().meth2().meth3()+1;
        System.out.println(result); //100
    }
}

/*
*   It is used to resolve the ambiguity between the Instance & Local Variables.
*   It is used to refer present class methods.
*   It returns the instance of present class.
*   "this" keyword can not be used inside a static area (Static block, static method)
* */