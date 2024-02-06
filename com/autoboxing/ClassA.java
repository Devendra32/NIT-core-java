package com.autoboxing;

public class ClassA {
    void meth1() {
        System.out.println("Implementing Auto-Boxing");
        int i = 10;
        Integer ival1 = Integer.valueOf(i);
        Integer ival2 = Integer.valueOf(100);
        Integer ival3 = Integer.valueOf("99");

        System.out.println("int PDT value :" + i); // PDT ---> premitive datatype
        System.out.println("Integer WCO value :" + ival1); // WCO -----> Wrapper class object
        System.out.println("Integer WCO value :" + ival2);
        System.out.println("Integer WCO value :" + ival3);

        System.out.println("----------------------------------");

        byte b = 50;
        Byte bval1 = Byte.valueOf(b);
        Byte bval2 = Byte.valueOf((byte) 1);
        System.out.println("byte PDT value :" + b);
        System.out.println("Byte WCO value :" + bval1);
        System.out.println("Byte WCO value :" + bval2);

        System.out.println("-----------------------------------");

        char c = 'A';
        Character cval1 = Character.valueOf(c);
        // Character cval2=Character.valueOf("Z"); // C.E because it will accepts only
        // char PDT

        System.out.println("chat PDT value :" + c);
        System.out.println("Character WCO value :" + cval1);
        // System.out.println("Character WCO value :"+cval2);

        // Boolean booleanval=new Boolean(true);
        // The above constructor Boolean(boolean) is deprecated since version 9
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }
}
