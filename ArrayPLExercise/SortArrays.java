package com.company;
import java.util.Arrays;
// THIS IS QUESTION 10
public class SortArrays {
    public static void main(String[] args){
        // This is question 10
        int[] num = {5,8,2,3,4,1,7,9,6};
        System.out.printf("Before sorting: %s", Arrays.toString(num));
        Arrays.sort(num);
        System.out.printf("After sorting: %s", Arrays.toString(num));
    }
}
