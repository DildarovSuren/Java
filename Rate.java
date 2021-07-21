package com.max.idea;
import java.util.Scanner;
public class Rate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий курс : ");
        double x = in.nextDouble();
        if (x<0) {
            System.out.println("Проверьте правильность введенных вами данных");
            System.exit(0);
        }


        System.out.println("Введите количество рублей: ");
        double y = in.nextDouble();
        if (y<0) {
            System.out.println("Введите сумму больше 0");
            System.exit(0);
        }

        double z = y/x;
        System.out.printf("Итого: %.2f долларов", z);

    }
}