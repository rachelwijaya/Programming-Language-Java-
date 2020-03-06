package com.company;
import java.util.Scanner;
import java.util.Arrays;

// THIS IS QUESTION 1
public class InputArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number in array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}


