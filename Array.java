package com.max.idea;

public class Array {
    public static void main(String[] args) {


            int[] myArray = new int[] {7,11,2,39,16};
            int first = myArray[0];
            int last = myArray[myArray.length - 1];
            myArray[myArray.length - 1] = first;
            myArray[0] = last;
            System.out.println(myArray[0] + myArray[myArray.length/2]);

    }
}