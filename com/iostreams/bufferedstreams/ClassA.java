package com.iostreams.bufferedstreams;

import java.io.*;

public class ClassA {
    public void meth1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\NIT\\file5.txt"));
        // BufferedInputStream bs=new BufferedInputStream(new
        // FileInputStream("D:\\NIT\\file3.txt"));
        System.out.println("Connection Created");
        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println();
        System.out.println("Data Retrieved");
        // bs.close();
        br.close();
    }

    public void meth2() throws IOException {
        // Writing files using Buffered Output Stream
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\NIT\\file4.txt", true));
        System.out.println("Connection Created");
        String data = ". I love to code in Java";
        byte[] arr = data.getBytes();
        bos.write(arr);
        System.out.println("Data written");
        bos.close();
    }

    public void meth3() throws IOException {
        // copying the data
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\NIT\\dev.JPG"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\NIT\\dev1.JPG"));
        System.out.println("connection created");
        int i;
        while ((i = bis.read()) != -1) {
            bos.write(i);
        }
        System.out.println("Data copied");
        bis.close();
        bos.close();

    }

    public void meth4() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("D:\\NIT\\dev.JPG"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\NIT\\dev1.JPG"));
        System.out.println("Connection Created:");
        int i;
        while ((i = br.read()) != -1) {
            bw.write(i);
        }
        System.out.println("Data Copied:");
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        ClassA aobj = new ClassA();
        // aobj.meth1();
        // aobj.meth2();
         aobj.meth3();
        //aobj.meth4();

    }

}
