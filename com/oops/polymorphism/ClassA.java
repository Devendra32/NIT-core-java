package com.oops.polymorphism;

public class ClassA {
  public void meth1(){
    System.out.println("ClassA meth1 called :");
  }
  public int meth1(int a){
    System.out.println("ClassA int meth1(a) called :");
    return a;
  }
  public void meth1(String s){
    System.out.println("ClassA meth1(string) called :"+ s);
  }
  public void meth1(String d, int b){
    System.out.println("ClassA meth1(string, int) called :"+d+" "+b);
  }
}
