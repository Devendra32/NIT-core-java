package com.innerclasses.staticinner;

public class OuterClassA {
    public int a = 10;
    public static int b = 20;

    void meth1() {
        System.out.println("outer class meth1 called");
    }

    public static class InnerClassA {
        public void meth2() {
            System.out.println("inner class meth2 called");
            System.out.println("instance variable a : " + new OuterClassA().a);
            System.out.println("instance variable b : " + b);
        }

        static {
            System.out.println("inner class static block");
        }

        private InnerClassA() {
            System.out.println("inner class constructor");
        }

        public static void main(String[] args) {
            System.out.println("inner main method");
            InnerClassA iobj = new InnerClassA();
            iobj.meth2();
            new OuterClassA().meth1();
        }
    }
    private OuterClassA() {
        System.out.println("Outer class constructor");
    }

    public static void main(String[] args) {
        OuterClassA.InnerClassA iobj1 = new OuterClassA.InnerClassA();
        iobj1.meth2();
    }
}
