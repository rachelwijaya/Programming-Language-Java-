package com.company;
import java.util.Scanner;
// THIS IS QUESTION 3
public class TwentyInts {
    public static void main(String[] args) {
        int positive = 0, negative = 0, odd = 0, even = 0, zeroes = 0;
        int[] intArr = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Enter integer to be put in array: ");
            intArr[i] = sc.nextInt();

            if (intArr[i] > 0) {
                positive++;
            } else if (intArr[i] < 0) {
                negative++;
            } else {
                zeroes++;
            }

            if (intArr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeroes: " + zeroes);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
