package com.company;
// THIS IS QUESTION 5
public class SmallestBiggest {
    public static void main(String[] args){
        int[] smallest = new int[1], biggest = new int[1], num = {1,4,23,7,0,16,-7,-3};

        for (int i=0; i < num.length ; i++){
            if (num[i]>biggest[0]){
                biggest[0] = num[i];
            }
            if (num[i] < smallest[0]){
                smallest[0] = num[i];
            }
        }
        System.out.print("Biggest: " + biggest[0] + "\nSmallest: " + smallest[0]);
    }
}
