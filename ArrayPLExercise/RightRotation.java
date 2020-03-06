package com.company;
import java.util.Arrays;
import java.util.Scanner;
// THIS IS QUESTION  9

public class RightRotation {
    public static void main(String[] args){
        int[] num =  new int[5];//initialize array
        int temp;
        Scanner sc = new Scanner(System.in);
        int i;
        for (i=0; i < num.length; i++){
            System.out.println("Enter number for array: ");
            num[i] = sc.nextInt();
        }
        temp = num[num.length-1];
        for (i=num.length-1; i>0; i--){
            num[i] = num[i-1];
        }
        num[0] = temp;
        System.out.println(Arrays.toString(num));
    }
}
