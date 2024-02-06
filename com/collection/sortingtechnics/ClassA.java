package com.collection.sortingtechnics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassA
{
    void meth1()
    {
        Integer []arr={10,5,35,8,9,32,45};
        List<Integer> ints = Arrays.asList(arr);
        System.out.println(ints);
        Collections.sort(ints);
        System.out.println(ints);
    }
    void meth2(){
        int[] arr1 = new int[10];

        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;
        arr1[5]=60;
        arr1[6]=70;
        arr1[7]=80;
        arr1[8]=90;
        arr1[9]=10;
    }

    public static void main(String[] args)
    {
        new ClassA().meth1();

    }
}
