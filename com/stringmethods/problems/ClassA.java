package com.stringmethods.problems;

public class ClassA {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    void meth1(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        if (s1.equalsIgnoreCase(s)) {
            System.out.println("Given string is Palindrome");
        } else {
            System.out.println("Given string is not Palindrome");
        }
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);

    }

    public String addMiddleName(String name, String middle) {
        int index = name.indexOf(' ');
        return name.substring(0, index) + " " + middle + " " + name.substring(index + 1);
    }

    public static void main(String[] args) {
        // System.out.println(new ClassA().helloName("Alice"));
        // System.out.println(new ClassA().makeAbba("Hi","Bye"));
        // new ClassA().meth1("Madam");
        // System.out.println(new ClassA().makeOutWord("<<>>", "hello"));
        System.out.println(new ClassA().addMiddleName("Lal Singh", "Bahadur"));
    }

}
