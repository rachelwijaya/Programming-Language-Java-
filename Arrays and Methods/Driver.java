package com.company;
import java.util.Scanner;

public class Driver {
    public static void menu(){
        System.out.println("Which function would you like to try?");
        System.out.println("1. Elements Splitting");
        System.out.println("2. Right Rotation");
        System.out.println("3. Symmetry Check");
        System.out.println("4. Magic Square");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Driver.menu();
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter the amount of elements in your array: ");
                int n = sc.nextInt();
                int[] num1 = new int[n];
                for (int i = 0; i < num1.length; i++){
                    System.out.println("Enter number in array: ");
                    num1[i] = sc.nextInt();
                }
                UtilityArrays.ElemSplit(num1);
                break;
            case 2:
                System.out.println("Enter the amount of elements in your array: ");
                n = sc.nextInt();
                int[] num2 = new int[n];
                for (int i = 0; i < num2.length; i++){
                    System.out.println("Enter number in array: ");
                    num2[i] = sc.nextInt();
                }
                System.out.println("How many rotations?");
                int rot = sc.nextInt();
                UtilityArrays.Rotation(num2, rot);
                break;
            case 3:
                int[][] matrix = new int[3][3];
                System.out.println("Enter numbers in matrix");
                for (int a=0; a < 3; a++){
                    for (int b=0; b < 3; b++){
                        matrix[a][b] = sc.nextInt();
                    }
                }
                UtilityArrays.Symmetry(matrix);
                break;
            case 4:
                System.out.println("Enter size of array");
                n = sc.nextInt();
                int[][] matrix2 = UtilityArrays.CreateMagic(n);
                System.out.println("The magic constant is: " + n*(n*n+1)/2);
                UtilityArrays.PrintMagic(matrix2, n);
                break;
            default:
                System.out.println("Please enter 1-4");
        }

    }
}
