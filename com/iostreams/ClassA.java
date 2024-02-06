package com.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassA
{
    public void meth1() throws IOException
    {
        //reading the data from a file
        FileInputStream fis=new FileInputStream("D:\\NIT\\file2.txt");
        System.out.println("Connection Created");
        int i;
        while((i=fis.read())!=-1) {
            System.out.print((char)i);
        }
        System.out.println("\nData Read");
        fis.close();
    }
    public void meth2() throws IOException
    {
        //Write data
        FileOutputStream fos = new FileOutputStream("D:\\NIT\\file2.txt");
        System.out.println("Connection Created");
        String data="Java is awesome";
        byte[] arr = data.getBytes();
        fos.write(arr);
        System.out.println("Data written");
        fos.close();
    }

    public void meth3() throws IOException
    {
        //Copying data from one file to another file
        FileInputStream fis=new FileInputStream("D:\\NIT\\file2.txt");
        FileOutputStream fos=new FileOutputStream("D:\\NIT\\file3.txt");
        int i;
        while((i=fis.read())!=-1)
        {
            fos.write(i);
        }
        System.out.println("Data copied");
        fis.close();
        fos.close();
    }
    public static void main(String[] args) throws Exception
    {
        ClassA aobj=new ClassA();
        aobj.meth1();
        //aobj.meth2();
        //aobj.meth3();


    }

}
