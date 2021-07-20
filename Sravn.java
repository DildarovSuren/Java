package com.max.idea;
import java.util.Scanner;
public class Sravn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String xs = in.next();
        System.out.println("Введите второе число: ");
        int yi = in.nextInt();
        double xd = Double.valueOf(xs);
        double yd = Double.valueOf(yi);


        double result = Math.max(xd,yd);
        if (result==xd) {
            System.out.println("Наибольшее число: " + xs);
            System.out.println("Наименьшее число: " + yd);
        }
        else {
            System.out.println("Наибольшее число: " + yi);
            System.out.println("Наименьшее число: " + xd);
        }
    }
}