package com.cloning;

public class ClassC
{
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Implementing clone() method..");
        ClassA aobj=new ClassA();
        aobj.a=10;
        aobj.b=20;
        System.out.println(aobj.a+" "+ aobj.b);

        ClassA aobj2=aobj;
        aobj2.b=200;
        System.out.println(aobj.a+" "+ aobj.b+" "+ aobj2.b);
        System.out.println("------------------------------------");

        ClassB bobj = new ClassB();
        bobj.x=100;
        bobj.y=200;
        System.out.println(bobj.x+" "+ bobj.y);

        ClassB bobj2 = bobj.show();
        bobj2.y=500;
        System.out.println(bobj.x+" "+ bobj.y+" "+bobj2.y+" "+bobj2.x);
    }
}
