package com.typecasting;

public class ClassA {
    void implicit(){
        System.out.println("Performing implicit typecasting");
        byte b=20;
        int i=b;

        System.out.println("byte value :"+b); //20
        System.out.println("int value :"+i); //20

        System.out.println("--------------------");

        char c='A';
        int x=c;

        System.out.println("char value :"+c); //A
        System.out.println("int value :"+x); //65
    }

    int meth1(){
        System.out.println("meth1() called");
        System.out.println("int & char both are compatible");
        return 'A'; // 65 ----------> ASCII value of 'A'
    }
    void explicit(){
        System.out.println("Performing implicit typecasting");

        int i=50;
        byte b1=(byte)i;

        System.out.println("int value :"+i);
        System.out.println("byte value :"+b1);

        System.out.println("-----------------------------------");

        int x=500;
        byte b2=(byte)x;
        System.out.println("int value :"+x); //500
        System.out.println("byte value :"+b2); //-12

        //[minimumRange + (Result-maximumRange-1)]
        //-128+(500-128) ==> -128+(372) ==> 244
        //-128+(244-128) ==> -128+116 ==> -12

        System.out.println("-----------------------------------");

        float f=10.9999f;
        byte b3=(byte)f;

        System.out.println("float value :"+f);  //10.9999
        System.out.println("byte value :"+b3); //10

    }

    public static void main(String[] args) {
        ClassA aobj=new ClassA();
        aobj.implicit();
        System.out.println("----------------------------");
        System.out.println(aobj.meth1()+'A');
        System.out.println("----------------------------");
        aobj.explicit();
    }
}
