package com.multithreading.intruptmethod;

public class ClassA extends Thread {
  public void run() {
    System.out.println("I am ready for attending interviews");
    for (int i = 1; i <= 5; i++) {
      System.out.println("This is my " + i + " interview");
    }
    System.out.println("I got placed now I can relax");
    try {
      Thread.sleep(10000); // 10 sec
    } catch (InterruptedException e) {
      System.out.println("my sleep got distrubed");
    }
    System.out.println("Time to go to office");
  }

  public static void main(String[] args) {
    ClassA aobj = new ClassA();
    Thread t1 = new Thread(aobj);

    t1.start();
    t1.interrupt(); 
    
    //interrupt() method brings back the sleeping thread into running state
    //if there is no thread in sleeping stage then interrupt() will not have any impact on program 
    

  }
}
