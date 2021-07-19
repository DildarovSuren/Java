package com.max.idea;
import java.util.Scanner;
public class Middle {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.println("Введите число: ");
                double x = in.nextDouble();
                System.out.println("Введите число: ");
                double y = in.nextDouble();
                System.out.println("Введите число: ");
                double z = in.nextDouble();

                double m = (x + y + z)/3;
                System.out.println("Среднее арифметическое: " + m);

                int result = (int)Math.floor(m/2);

                if (result > 3) {
                    System.out.println("Программа выполнена корректно");
                }
            }
        }