package com.staticvariables.staticblock;

public class ClassC {
      static int b=m1();
      static int m1(){
        System.out.println("static meth called :");
      return 100;
      }

      public static void main(String[] args) {
        System.out.println("main meth called:"+b);
      }
}
