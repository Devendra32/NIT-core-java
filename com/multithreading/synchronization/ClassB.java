package com.multithreading.synchronization;

public class ClassB extends Thread {
  public void run(){
    String name = Thread.currentThread().getName();
      synchronized(this){ //sychronizing 
        for (int i = 1; i <= 5; i++) {
          System.out.println(name+" has entered synchronized block : " + i);
        }
      }
      System.out.println(name+" has complete it's execution");
  }
  public static void main(String[] args) {
    ClassB bobj=new ClassB();
    
    Thread t1= new Thread(bobj);
    Thread t2= new Thread(bobj);
    
    t1.start();
    t2.start();
  }
}
