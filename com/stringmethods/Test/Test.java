package com.stringmethods.Test;

public class Test {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "abc";
    System.out.println("s1 == s2 is:" + (s1 == s2)); // S1 == s2 is:true
    System.out.println("s1 == s2 is:" + s1 == s2); // false
    System.out.println(s1 instanceof String); //true
    StringBuilder sb = new StringBuilder("abc");
    StringBuilder sb1 = new StringBuilder("def");
    
    System.out.println(sb instanceof StringBuilder); //true
    System.out.println(sb.equals(sb1)); //false
  }
}
