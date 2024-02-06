package com.stringmethods;

public class ClassB {

  public String changeCase(String s) {
    StringBuilder sb = new StringBuilder(s.trim());

    int firstIndex = sb.indexOf(" ", 0);
    int secondIndex = sb.lastIndexOf(" ");

    sb.setCharAt(firstIndex - 1, Character.toUpperCase(sb.charAt(firstIndex - 1)));
    sb.setCharAt(secondIndex + 1, Character.toUpperCase(sb.charAt(secondIndex + 1)));
    //System.out.println(sb);
    return String.valueOf(sb);
  }

  public static void main(String[] args) {
    new ClassB().changeCase("    rahul    SIngh    ");
  }

}
