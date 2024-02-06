package com.innerclasses.nested;

public class OuterClassA {
    int a = 10;
    public void meth1(){
        System.out.println("outer class meth1");
    }
    OuterClassA(){
        System.out.println("constructor from outer class");
    }
    class InnerClassA{
        public void show(){
            System.out.println("Inner class show method");
            meth1();
        }

        InnerClassA(){
            System.out.println("inner class constructor");
        }
    }

    public static void main(String[] args) {
        System.out.println("outer class main method.");
        OuterClassA.InnerClassA iobj=new OuterClassA().new InnerClassA();
        iobj.show();
//        iobj.meth1();  //C.E
    }
}
