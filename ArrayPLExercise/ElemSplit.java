package com.company;
import java.util.Arrays;
import java.util.Scanner;
// THIS IS QUESTION 8
public class ElemSplit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[5], num2 = new int[num1.length+1];
        int highest, nextHighest = 0, additive;
        for (int i = 0; i < num1.length; i++){
            System.out.println("Enter number in array: ");
            num1[i] = sc.nextInt();
        }
        highest = num1[0];
        for (int value : num1) {
            if (value > highest) {
                highest = value;
            }
        }
        for (int value : num1) {
            if (value > nextHighest && value < highest) {
                nextHighest = value;
            }
        }
        System.out.println(nextHighest);
        additive = highest - nextHighest;
        // Finding the position of the index for highest
        int highestIndex = 0;
        for (int i=0; i<num1.length; i++){
            if (num1[i] == highest){
                highestIndex = i;
            }
        }
        System.out.println(highestIndex);
        for (int i=0; i < highestIndex +2; i++){
            if (i != highestIndex){
                num2[i] = num1[i];
            }
            else{
                num2[i] = nextHighest;
                num2[i+1] = additive;
                break;
            }
        }
        System.out.println(Arrays.toString(num2));
        for (int i = highestIndex+2; i<num2.length; i++){
            num2[i] = num1[i-1];
        }
        System.out.println(additive);
        System.out.println(Arrays.toString(num2));
    }
}
