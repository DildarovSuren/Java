package com.max.idea;
import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int x = in.nextInt();
        if (x<0) {
            System.out.println("Введите ПОЛОЖИТЕЛЬНОЕ число!");
        }
        else {
            int total = 0;
            for (int i = 0; i <= x; i++) {
                if (!(i%2 == 0)) {
                    total += i;
                }
            }
            System.out.println("Сумма всех нечетных чисел до " + x + ": "+total);
        }
    }
}