package com.max.idea;
import java.util.Scanner;
public class Manymuch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int x = in.nextInt();
        if (x<=0) {
            System.out.println("Введите число больше 0!");
        }
        else {
            double[] myArray = new double[x];
            for (int i = 0; i <myArray.length; i++) {
                System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
                double elem = in.nextDouble();
                myArray[i] = elem;
            }
            double total = 0;
            for (int i = 0; i < myArray.length; i++) {
                total = total + myArray[i];
            }
            System.out.println("Среднее арифметическое каждого элемента массива: " + total/myArray.length);
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i] * total / myArray.length);
            }
        }
    }
}