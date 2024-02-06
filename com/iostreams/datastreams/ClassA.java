package com.iostreams.datastreams;

import java.io.*;

public class ClassA 
{
    public void meth1() throws Exception
    {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\NIT\\file7.txt"));
        System.out.println("Connection Created");
        dos.writeInt(1000);
        dos.writeChar('A');
        dos.writeInt(2000);
        dos.writeBoolean(true);
        System.out.println("Data entered");
        dos.close();
        System.out.println("------------------------------------------");
        DataInputStream dis=new DataInputStream(new FileInputStream("D:\\NIT\\file7.txt"));
        //Order must be same as data entered....
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readInt());
        System.out.println(dis.readBoolean());
        System.out.println("Data Retrieved");
        dis.close();

    }

    public static void main(String[] args) throws Exception
    {
        ClassA aobj = new ClassA();
        aobj.meth1();

    }
}
