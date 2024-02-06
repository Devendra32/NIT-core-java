package com.multithreading.synchronization;

public class ClassA extends Thread {

  synchronized public void run() { //Sychronizing whole method
    criticalResources();
  }

  public void criticalResources() {
    String name = Thread.currentThread().getName();
    System.out.println(name + " has entered critical resources...");
    for (int i = 1; i <= 5; i++) {
        System.out.println(name+" i value :"+i);
    }
    System.out.println(name+" has completed it's execution...");
  }
  public static void main(String[] args) {
    ClassA aobj = new ClassA();
    Thread t1 = new Thread(aobj);
    Thread t2 = new Thread(aobj);

    t1.start();
    t2.start();
  }
}
