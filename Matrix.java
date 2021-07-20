package com.max.idea;
import java.util.Scanner;
import java.util.Arrays;
public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество строк (целое число): ");
        int x = in.nextInt();
        System.out.println("Введите колличество столбцов (целое число): ");
        int y = in.nextInt();
        if (x<=0 || y<=0) {
            System.out.println("Недопустимый размер массива!");
        }
        else {
            double[][] myArray = new double[x][y];
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[0].length; j++) {
                    System.out.println("Введите значение для " + (j + 1) + "-ого элемента " + (i + 1) + "-ой строки матрицы: ");
                    double elem = in.nextDouble();
                    myArray[i][j] = elem;
                }
            }
            System.out.println("Матрица: ");
            System.out.println(Arrays.deepToString(myArray));
            System.out.println("Первая строка умноженная на 3: ");
            for (int j = 0; j < myArray[0].length; j++) {
                double elem2 = myArray[0][j] * 3;
                System.out.print(elem2 + "; ");
            }
        }
    }
}