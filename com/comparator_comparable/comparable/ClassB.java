package com.comparator_comparable.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassB
{
    public void meth1()
    {
        ClassA aobj1=new ClassA("Dev", 111, "Java");
        ClassA aobj2=new ClassA("Ram", 102, "Pythod");
        ClassA aobj3=new ClassA("Aman", 108, "Android");
        ClassA aobj4=new ClassA("Shyam", 103, "JavaScript");

        ArrayList<ClassA> al=new ArrayList<>();
        al.add(aobj1);
        al.add(aobj2);
        al.add(aobj3);
        al.add(aobj4);

        Collections.sort(al);
//        System.out.println(al);

        Iterator<ClassA> it = al.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args)
    {
        new ClassB().meth1();
    }
}
