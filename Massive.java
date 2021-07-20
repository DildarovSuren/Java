package com.max.idea;
import java.util.Scanner;
public class Massive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 1;
        int y = 2;
        int z = 17;

        System.out.println("Введите размер массива: ");
        int m = in.nextInt();
        if (m<=0) {
            System.out.println("Введите число больше 0");
        }
        else {
            double[] myArray = new double[m];
            for (int i = 0; i < myArray.length; i++) {
                System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
                double elem = in.nextDouble();
                if (elem == x || elem == y || elem == z) {
                    System.out.println("Значение " + elem + " имеется в константах");
                }
                myArray[i] = elem;
            }
        }
    }
}