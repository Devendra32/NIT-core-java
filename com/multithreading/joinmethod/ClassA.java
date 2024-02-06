package com.multithreading.joinmethod;

public class ClassA extends Thread {

  public void run() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("ClassA run() called : "+i);
    }
  }

}
