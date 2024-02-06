package com.innerclasses.methodlocal;

public class OuterClassA {
    public int a = 20;

    void meth1() {
        System.out.println("outer class meth1 called");
        class InnerClassA {
            InnerClassA() {
                System.out.println("inner class constructor called");
                System.out.println("outer class instance variable : "+a);
            }

            void meth2() {
                System.out.println("inner class meth2 called");
            }
        }
        new InnerClassA().meth2();
    }

    public OuterClassA() {
        System.out.println("outer class constructor called");
    }

    public static void main(String[] args) {
        new OuterClassA().meth1();
    }

}
