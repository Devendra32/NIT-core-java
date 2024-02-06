package com.array;

import java.util.Arrays;

public class ClassA {
    int[] meth1(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 2 && arr[i + 1] == 3) {
                arr[++i] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ClassA().meth1(new int[]{2,3,3})));
    }
}
