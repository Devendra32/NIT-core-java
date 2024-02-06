package com.multithreading;

public class ClassA implements Runnable
{
    @Override
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("run() executed : "+i);
        }
    }

    public static void main(String[] args)
    {
        ClassA aobj=new ClassA();

        Thread t1 = new Thread(aobj);
        Thread t2 = new Thread();

        t1.start(); //A new Thread will be created and that new Thread is responsible
                    // for running the run() present in ClassA
        //t1.run(); // No new thread will be created, we are directly calling the run()
                    // present in Thread Class but ClassA run() will be executed because of overriding

       t2.start(); // A new thread will be created and that new Thread is responsible
                    // & it will run the run() method present in Thread class

        //t2.run(); // No new Thread will be created, we are directly calling the run() present in Thread class

    }
}
