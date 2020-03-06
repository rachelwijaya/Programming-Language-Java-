package com.company;
// THIS IS QUESTION 4
public class SumProduct {
    public static void main(String[] args){
        int sum = 0, product = 1;
        int[] num = {4,5,6,7,8,3,8,9,7,12};

        for (int i=0; i < num.length; i++){
            sum = sum + num[i];
            product = product * num[i];
        }
        System.out.println("Sum = " + sum + "\nProduct = " + product);
    }
}
