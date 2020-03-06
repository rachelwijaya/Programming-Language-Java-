package com.company;
import java.util.Arrays;
// THIS IS QUESTION 7
public class ArraySplit {
    public static void main(String[] args){
        int[] num = {4,22,5,8,9,7,9,0};
        int[]subArr1 = Arrays.copyOfRange(num, 0,num.length/2), subArr2 = Arrays.copyOfRange(num, (num.length+1)/2, num.length);
        System.out.print(Arrays.toString(subArr1) + " " + Arrays.toString(subArr2));
    }
}
