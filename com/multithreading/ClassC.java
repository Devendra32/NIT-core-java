package com.multithreading;

public class ClassC implements Runnable{
    @Override
    synchronized public void run() {
      for (int i = 1; i < 11; i++) {
        System.out.println(Thread.currentThread().getName()+": 2 x "+i+" = "+2*i);

      //  try{

      //    Thread.sleep(1000);
      //  }catch(InterruptedException e){
      //    e.printStackTrace();
      //  }
      }
    }
    public static void main(String[] args) {
      ClassC cObj = new ClassC();
      Thread t1 = new Thread(cObj);
      Thread t2 = new Thread(cObj);

      t1.setName("first-thread");
      t2.setName("second-thread");

      t1.start();
      t2.start();
      System.out.println(t1.getState()); //Checking thread state
    }
}
