package com.collection.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ClassA {

  public void meth1(){
    Vector<Integer> vector = new Vector<>();
    vector.add(1);
    vector.add(2);
    vector.add(3);
    vector.add(4);
    vector.add(5);
    vector.add(6);
    vector.add(7);
    vector.add(8);
    vector.add(9);
    vector.add(10);
    vector.add(11);
    System.out.println(vector.capacity());
  }

  public void meth2(){
    List<Object> ll = new ArrayList<>();
    ll.add("Ram");
    ll.add(10);
    ll.add(99.5);
    ll.add("Shyam");
    ll.add(true);
    ll.add(1000);
    ll.add(200);
    ll.add(535.62);
    ll.add(1058);
    ll.add(5558);
    //Retrieving data using traditional for 
    for (int i = 0; i < ll.size(); i++) {
      System.out.print(ll.get(i)+" "); 
    }

    System.out.println();
    //Retrieving data using traditional for each
    for (Object ll1 : ll) {
      System.out.print(ll1+" ");
    }
    System.out.println();
    //Retrieving data using traditional Iterator
    Iterator<Object> it =ll.iterator();
    while (it.hasNext()) {
      System.out.print(it.next()+" ");
    }

    System.out.println();
    //Retrieving data using traditional list iterator
    ListIterator<Object> ltt =ll.listIterator();

    while (ltt.hasNext()) {
      System.out.print(ltt.next()+" ");
    }
  }

    public static void main(String[] args) {
      new ClassA().meth2();
    }
}
