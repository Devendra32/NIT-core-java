package com.multithreading.interthread;

public class ClassA {
  int amount = 10000;

  synchronized void withdraw(int amount) throws InterruptedException {
    if (this.amount < amount) {
      System.out.println("insufficient balance...");
      wait(10000, 500);
      System.out.println("Amount credited...");
      this.amount -= amount;
      System.out.println("Withdraw successful \nBalance is " + this.amount);
    } else {
      this.amount -= amount;
      System.out.println("Withdraw successful \nBalance is " + this.amount);
    }
  }

  synchronized void deposit(int amount) {
    this.amount += amount;
    System.out.println("Deposited successfully...\nBalance is " + this.amount);
    //notify();
    // notifyAll();
  }
}
