package com.stringmethods;

import java.util.Arrays;

public class ClassA {
    void meth1() {
        String date = "8/sep/2023";
        String msg = "I love India";

        String[] arr1 = date.split("/");
        System.out.println("arr1===>" + Arrays.toString(arr1));

        String[] arr2 = msg.split(" ");
        System.out.println("arr2===>" + Arrays.toString(arr2));

        String[] arr3 = msg.split(" ", 2);
        System.out.println("arr3===>" + Arrays.toString(arr3));

        System.out.println("-----------------------------------");
        String s = "ABCDEF";
        byte[] data = s.getBytes();
        System.out.println("data===>" + Arrays.toString(data));

        for (byte x : data) {
//            System.out.print(x+" ");
            System.out.print((char)x+" ");

        }

    }

    public static void main(String[] args) {
        new ClassA().meth1();
    }
}
