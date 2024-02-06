package com.stringmethods.stringbufferandbuilder;

public class ClassA {
    void meth1(){
        String s1=new String("Java");
        StringBuffer buffer1=new StringBuffer("Java");
        StringBuilder builder1=new StringBuilder("Java");

        s1.concat(" is awesome");
        //s1=s1.concat(" is awesome");
        buffer1.append(" is awesome");
        builder1.append(" is awesome");

        System.out.println("String data : "+s1); //Java
        System.out.println("StringBuffer data : "+buffer1); // Java is awesome
        System.out.println("StringBuilder data : "+builder1); // Java is awesome
    }
    void meth2(){
        String s1=new String("Java");
        StringBuffer buffer1=new StringBuffer("Java");
        StringBuilder builder1=new StringBuilder("Java");

        String s2=new String("Java");
        StringBuffer buffer2=new StringBuffer("Java");
        StringBuilder builder2=new StringBuilder("Java");

        /*
        * SCP is special memory allocated only for String class objects
        * Whenever we are using StringBuffer (or) StringBuilder objects will be created inside HM
        * */

        //using equals() in String Class, StringBuffer Class & StringBuilder Class

        System.out.println("String Class : "+s1.equals(s2)); //true
        System.out.println("StringBuffer : "+buffer1.equals(buffer2)); //false
        System.out.println("StringBuilder : "+builder1.equals(builder2)); //false
    
        //using = = operator on String class, StringBuffer class & StringBuilder Class
        System.out.println("String Class : "+s1==s2); //false
        System.out.println("StringBuffer Class : " +(buffer1==buffer2)); //false
        System.out.println("StringBuilder Class : "+(builder1==builder2)); //false

        //Q) How to check the contents present inside StringBuffer (or) StringBuilder
        System.out.println("=======================================");
        System.out.println(buffer1.toString().equals(buffer2.toString())); //true
        System.out.println(builder1.toString().equals(builder2.toString())); //true
    }

    public static void main(String[] args) {
        ClassA aobj=new ClassA();
        aobj.meth1();
        aobj.meth2();
    }
}
