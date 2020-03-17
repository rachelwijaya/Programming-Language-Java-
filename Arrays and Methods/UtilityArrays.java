package com.company;
import java.util.Arrays;

public class UtilityArrays {
    public static void ElemSplit(int[] num1) {
        int[] num2 = new int[num1.length + 1];
        int highest, nextHighest = 0, additive;

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
        additive = highest - nextHighest;
        // Finding the position of the index for highest
        int highestIndex = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == highest) {
                highestIndex = i;
            }
        }
        for (int i = 0; i < highestIndex + 2; i++) {
            if (i != highestIndex) {
                num2[i] = num1[i];
            } else {
                num2[i] = nextHighest;
                num2[i + 1] = additive;
                break;
            }
        }
        for (int i = highestIndex + 2; i < num2.length; i++) {
            num2[i] = num1[i - 1];
        }
        System.out.println(Arrays.toString(num2));
    }

    public static void Rotation(int[] num2, int rotation) {
        int[] temp = new int[num2.length];
        for (int i = 0; i < rotation; i++) {
            temp[0] = num2[num2.length - 1];

            for (int j = 0; j < temp.length - 1; j++) {
                temp[1 + j] = num2[j];
            }
            for (int k = 0; k < temp.length; k++) {
                num2[k] = temp[k];
            }
        }
        System.out.println(Arrays.toString(num2));
    }

    public static void Symmetry(int[][] num3) {
        boolean symmetric = true;
        // check symmetry
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (num3[a][b] != num3[b][a]) { //check if original matrix is equal to its transposed
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }

    public static int[][] CreateMagic(int n) {
        int[][] matrix = new int[n][n];
        if (n % 2 != 0) {
            //Initialize position for 1
            int i = n / 2, j = n - 1;
            for (int k = 1; k <= n * n; ) {
                if (i == -1 && j == n) { // in the case that the position goes over the size of the matrix
                    j = n - 2;
                    i = 0;
                } else {
                    if (j == n) { // helps the next iteration so it wont go out of the size of matrix
                        j = 0;
                    }
                    if (i < 0) { // helps next iteration so it wont go out of bounds
                        i = n - 1;
                    }
                }
                if (matrix[i][j] != 0) { // in the case the position is filled, the number is placed in another position
                    j -= 2;
                    i++;
                    continue;
                } else {
                    matrix[i][j] = k++;
                    i--;
                    j++;
                }
            }
        }
        else{
            // if size n was even

        }
        return matrix;
    }

    public static void PrintMagic(int[][] matrix, int n) {
        for (int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

