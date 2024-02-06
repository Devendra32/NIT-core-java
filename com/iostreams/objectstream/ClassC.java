package com.iostreams.objectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassC
{
    public static void main(String[] args) throws Exception
    {
        ClassA aobj = new ClassA();
        ClassB bobj = new ClassB();

        //Serialization
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\NIT\\Data.ser"));
        oos.writeObject(aobj);
        oos.writeObject(bobj);

        oos.close();
        System.out.println("---------------------------------");
        //Order Must be same as entered

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\NIT\\Data.ser"));
        ClassA aobj2=(ClassA)ois.readObject();
        ClassB bobj2=(ClassB)ois.readObject();

        System.out.println(aobj2.a+" "+aobj2.b);
        System.out.println(bobj2.x+" "+bobj2.y);
        
        ois.close();


    }
}
