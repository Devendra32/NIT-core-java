package com.oops.polymorphism;

public class ClassB extends ClassA {
  @Override
  public void meth1(String s){
    super.meth1(s);
    System.out.println("ClassB meth1() called :");
  }
  public static void main(String[] args) {
    new ClassB().meth1("ram");
    new ClassB().meth1("dev",20);
    new ClassB().meth1("ram");
  }
  
}
