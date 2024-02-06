package com.gc;

public class ClassA {
    void meth1(){
        System.out.println("meth1 called()");
        //ClassA aobj = new ClassA(); //3rd way all objects created inside method
    }

    //It will be called internally by the garbage collector
    protected void finalize(){
        System.out.println("Garbage has been collected");
    }

    public static void main(String[] args) {
        ClassA aobj1=new ClassA(); //1st object
        //ClassA aobj2=new ClassA(); //2nd object

        aobj1.meth1();

        //aobj2=aobj1; // 1st way by Re-assigning the reference variable

        //aboj1=null; // 2nd way by Nullifying the reference variable.

        //aboj1.meth1();// It will generate null pointer exception

        //System.gc(); //It is used to call the garbage collector manually

        Runtime r=Runtime.getRuntime();
        r.gc();
    }
}
