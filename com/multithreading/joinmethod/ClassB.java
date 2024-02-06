package com.multithreading.joinmethod;

public class ClassB {
  public static void main(String[] args) throws InterruptedException {
    ClassA aobj = new ClassA();

    aobj.start();

    aobj.join();
    
    for (int i = 1; i <= 5; i++) {
      System.out.println("ClassB main thread : " + i);
    }
  }
}
