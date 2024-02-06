package com.interfaces;

public class ClassA extends ClassB implements InterfaceA, InterfaceB
{
    public void meth1()
    {
        System.out.println("InterfaceA abstract method Overridden");
    }
    public void show()
    {
        System.out.println("InterfaceB abstract method Overridden");
    }
    public void display()
    {
        InterfaceA.super.display();
        InterfaceB.super.display();
    }

    public static void main(String[] args)
    {
        InterfaceA aobj=new ClassA();
        aobj.meth1();
        aobj.meth2();
        //aobj.meth3();//C.E
        InterfaceA.meth3();
        //aobj.meth4(); //C.E

        System.out.println("-----------------");
        InterfaceB bobj=new ClassA();
        bobj.show();
        System.out.println("-----------------");
        ClassA obj=new ClassA();
        obj.display();
        obj.msg();
    }
}
