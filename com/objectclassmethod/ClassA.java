package com.objectclassmethod;

public class ClassA
{
    int meth1()
    {
        System.out.println("meth1() called");
        return 100;
    }
    public static void main(String [] args)
    {
        ClassA aobj1 = new ClassA();
        ClassA aobj2 = new ClassA();

        int aobj1hascode=aobj1.hashCode(); //return unique identification number for aobj1 object
        int aobj2hascode=aobj2.hashCode(); //return unique identification number for aobj2 object

        System.out.println("aobj1 hashCode is : "+aobj1hascode);
        System.out.println("aobj2 hashCode is : "+aobj2hascode);
        System.out.println("------------------------------");

        System.out.println(aobj1.equals(aobj2)); //false
        System.out.println(aobj1.equals(aobj1)); //true
        System.out.println(aobj2.equals(aobj2)); //true
        System.out.println("------------------------------");

        System.out.println(aobj1.getClass()); //return class package name ex: class com.objectclassmethod.ClassA
        System.out.println(aobj2.getClass()); //
        System.out.println("------------------------------");

        System.out.println(aobj1.toString()); //return object as String ex: com.objectclassmethod.ClassA@5234DF
        System.out.println(aobj2.toString());
        

		/*
		hashCode():
		-----------
		It provides a unique identification number for your ClassObject Which is used to distinguish TWO objects separately.
		It will not provide the address locations of an Object.
		** we can not get the address locations of an object.

		equals():
		---------
		equals() is a boolean method, which checks the address locations of TWO objects. If both the Objects are present in the SAME address location, equals() whill return "true". If they are different locations then equals() will return "false".

		getClass():
		-----------
		It is used to get the fully qualified ClassName.

		toString():
		-----------
		It is used to convert the Object into String represented format.


		*/

    }
}