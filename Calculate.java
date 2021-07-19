package com.max.idea;
import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextDouble();
        System.out.println("Введите число y: ");
        double y = in.nextDouble();
        System.out.println("Действие: ");
        char z = in.next().charAt(0);


        double result;
        switch (z) {
            case '+':
                result = x + y;
                System.out.println("Результат: " + x + z + y + " = " + result);
                break;
            case '-':
                result = x - y;
                System.out.println("Результат: " + x + z + y + " = " + result);
                break;
            case '*':
                result = x * y;
                System.out.println("Результат: " + x + z + y + " = " + result);
                break;
            case '/':
                result = x / y;
                System.out.println("Результат: " + x + z + y + " = " + result);
                break;
            default:
                System.out.println("Ошибка при вводе действия");
        }
    }
}