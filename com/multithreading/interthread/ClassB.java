package com.multithreading.interthread;

public class ClassB {
  public static void main(String[] args) {
    ClassA aobj = new ClassA();

    new Thread() {
      public void run() {
        try {
          aobj.withdraw(15000);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }.start();

    new Thread() {
      public void run() {
        try {
          aobj.deposit(10000);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }.start();

  }

}
