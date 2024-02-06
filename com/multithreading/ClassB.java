package com.multithreading;

public class ClassB extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        for (int i=1; i<=5; i++)
        {
            System.out.println(name+"("+priority+")"+" has executed run() : "+i);
        }
    }

    public static void main(String[] args)
    {
        ClassB bobj= new ClassB();

        Thread t1 = new Thread(bobj);
        Thread t2 = new Thread(bobj);

        t1.setName("First-Thread");
        t2.setName("Second-Thread");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}


/*
*       Thread Scheduler:
*       -----------------
*          It will decide which Thread should start its execution basing upon two things
*               ========> Thread Priorities
*               ========> Underlying OS (Hardware Apparatus)
*
*       Thread Priorities:
*       ------------------
*              Thread priorities varies between 1 to 10
*                                   Minimum Priority : 1
*                                   Normal Priority  : 5
*                                   Maximum Priority : 10
* */