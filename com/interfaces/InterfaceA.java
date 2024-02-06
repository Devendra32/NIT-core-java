package com.interfaces;

public interface InterfaceA {
    void meth1();
    default void meth2() //allowed from Java 1.8v
    {
        System.out.println("default method of InterfaceA");
        this.meth4();
    }
    static void meth3() //allowed from Java 1.8v
    {
        System.out.println("static method of InterfaceA");
        //this.meth4(); //C.E. because we cant use this keyword inside a static area
    }
    private void meth4() //allowed from Java 1.9v
    {
        System.out.println("private method of InterfaceA");
    }
    default void display()
    {
        System.out.println("InterfaceA display()");
    }

    public static void main(String[] args) {
        System.out.println("main() of InterfaceA");
        InterfaceA.meth3();
    }

}
