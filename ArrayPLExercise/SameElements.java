package com.company;
// THIS IS QUESTION 6
public class SameElements {
    public static void main(String[] args){
        int[] num = {2,5,3,3,5,2};
        boolean same = true;
        for (int i=0; i < num.length/2; i++){
            if (num[i] != num[num.length-1-i]){
                same = false;
                break;
            }
        }
        if (same == true){
            System.out.print("Array elements are the same if read from front and end");
        }
        else{
            System.out.print("Array elements are not the same if read from front and end");
        }

    }
}
