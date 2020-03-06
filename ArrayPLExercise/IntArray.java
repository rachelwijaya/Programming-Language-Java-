package com.company;
import java.util.Scanner;
import java.util.Arrays;
// THIS IS QUESTION 2

public class IntArray {
    public static void intChecker(Integer[] intArray, int n2) {
        boolean found = Arrays.asList(intArray).contains(n2);
        if (found == true) {
            System.out.println("Found in array");
        } else {
            System.out.println("Not found in array");
        }
    }

    public static void main(String[] args){
        Integer[] num = new Integer[10];
        int i;
        Scanner n = new Scanner(System.in);

        for (i=0; i < num.length; i++){
            System.out.println("Enter number: ");
            num[i] = n.nextInt();
        }
        Scanner intCheck = new Scanner(System.in);
        System.out.println("Input number to check if it's in the array: ");
        int n2 = intCheck.nextInt();
        intChecker(num, n2);
        }
    }