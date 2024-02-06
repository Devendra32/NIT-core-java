package com.multithreading.daemon;

public class ClassA extends Thread {

  public void run(){
    int i=0;
    while(true){
      i+=i;
      System.out.println("Daemon : "+i);
    }
  }
  public static void main(String[] args) {
    ClassA aobj=new ClassA();
    Thread td=new Thread(aobj);
    td.setDaemon(true);
    td.start();

    for (int i = 1; i <= 20; i++) {
        System.out.println("main : "+i);
    }
    System.out.println("end of main...");
  }
  
}

/*
 * Daemon Threads
 * ---------------
 * Daemon threads are threads with infinite loop which would be
 * supporting the parent thread as a background process and it is supposed
 * to get executed along with parent thread. Also, this background
 * thread should stop, when the parent thread stops.
 * 
*/