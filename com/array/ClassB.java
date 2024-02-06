package com.array;

import java.util.Arrays;

public class ClassB {
  // remove duplicate elements from sorted arr
  public void removeDuplicate(int[] arr) {

    int ptr = 0;
    for (int i = 1; i < arr.length; i++) { // i = 3
      if (arr[ptr] != arr[i]) { // ptr = 1 20==30
        arr[++ptr] = arr[i]; // ptr =2
      }
    }
    for (int i = 0; i <= ptr; i++) {
      System.out.print(arr[i] + " ");
    }
    // System.out.println(Arrays.toString(arr));
  }

  public void removeDuplicate1(int[] arr) {
    int j = 1;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[j++] = arr[i+1];
      }
    }
    System.out.println("j :" + j);
    int[] temp = new int[j];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = arr[i];
    }
    System.out.println("After :" + Arrays.toString(temp));
  }
   public void printDuplicates(int[] arr) {
    int j = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        arr[j++] = arr[i+1];
      }
    }
    System.out.println("j :" + j);
    int[] temp = new int[j];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = arr[i];
    }
    System.out.println("After :" + Arrays.toString(temp));
  }

  public static void main(String[] args) {
    new ClassB().removeDuplicate1(new int[] { 10, 10, 20, 30, 30, 40, 40, 50, 50, 50 });
    new ClassB().printDuplicates(new int[] { 10, 10, 20, 30, 30, 40, 40, 50, 50, 50 });
  }
}
