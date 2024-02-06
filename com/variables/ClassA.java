package com.variables;

public class ClassA
{
    int a=10; //instance variable
    static int b=20; //Static variable

//static String a="java"; //C.E. [because we cant write same name for instance & static variables]

    int x; //instance variable
    static int y; //static variable

    boolean flag; // instance variable

    void meth1()
    {
        System.out.println("meth1() called");
        //int c=30; // local variable

        System.out.println("Instance Variable a :"+a);
        System.out.println("Instance Variable a :"+new ClassA().a);
        //----------------------------------
        System.out.println("Static Variable b :"+b);
        new ClassA();
        System.out.println("Static Variable b :"+ClassA.b);
        System.out.println("Static Variable b :"+ClassA.b);
    }
    void meth2()
    {
        System.out.println("meth2() called");
        //int z; //Local Variable
        System.out.println("Instance Variable x :"+x); // 0
        System.out.println("Instance Variable flag :"+flag); //flase
        System.out.println("Static Variable y :"+y); //0
        //System.out.println("Local Variable c :"+z); //C.E [Because we are not initializing]

    }
    void meth3()
    {
        System.out.println("meth3() called");
        int a =100;
        int b =200;
        int c =300;
        System.out.println("Instance Variable a :"+new ClassA().a); //10
        System.out.println("Static Variable b :"+ClassA.b); //20
        System.out.println("Local Variable a :"+a);
        System.out.println("Local Variable b :"+b);
        System.out.println("Local Variable c :"+c);
    }
    public void meth4(){
        System.out.println("meth4() called");
        for (int i=0; i<3; i++){
            System.out.println("instance variable a :"+a++);
            System.out.println("static variable b :"+b++);
            System.out.println();
        }
        System.out.println("------------------------------------");
        for (int i=0; i<3; i++){
            System.out.println("instance variable a :"+new ClassA().a++);
            System.out.println("static variable b :"+ClassA.b++);
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        ClassA aobj=new ClassA();
//        aobj.meth1();
//        System.out.println("-----------------------");
//        aobj.meth2();
//        System.out.println("-----------------------");
//        aobj.meth3();
        aobj.meth4();
    }
}