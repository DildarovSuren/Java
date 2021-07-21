package com.max.idea;
import java.util.Scanner;
public class Calcu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите уравнение: ");
        String ur = in.nextLine();

        int dl = ur.length();
        if (dl != 5) {
            System.out.println("Длина не должна превышать 5 символов");
            System.exit(0);
        }

        char res;
        res = ur.charAt(3);
        if (res != '=') {
            System.out.println("Знак равенства должен быть 4-м в уравнении");
            System.exit(0);
        }

        int inx = 0;
        do {
            res = ur.charAt(inx);
            inx++;
        } while (res != 'x');
        inx = inx - 1;


        int ina = 0;
        int inb = 0;

        if (inx == 0) {
            ina = 2;
            inb = 4;
        } else if (inx == 2) {
            ina = 0;
            inb = 4;
        } else if (inx == 4) {
            ina = 0;
            inb = 2;
        } else {
            System.out.println("Ошибка");
            System.exit(0);
        }

        boolean isNum = Character.isDigit(ur.charAt(ina));
        if (!isNum) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        isNum = Character.isDigit(ur.charAt(inb));
        if (!isNum) {
            System.out.println("Ошибка");
            System.exit(0);
        }

        int a;
        int b;
        res = ur.charAt(1);
        String[] myArray = ur.split("");
        if (res == '+') {
            if (inx == 0 || inx == 2) {
                a = Integer.parseInt(myArray[ina]);
                b = Integer.parseInt(myArray[inb]);
                System.out.print(b-a);
            } else if (inx == 4) {
                a = Integer.parseInt(myArray[ina]);
                b = Integer.parseInt(myArray[inb]);
                System.out.print(a+b);
            } else {
                System.out.println("Ошибка");
                System.exit(0);
            }
        }
        else if (res == '-') {
            if (inx == 0) {
                a = Integer.parseInt(myArray[ina]);
                b = Integer.parseInt(myArray[inb]);
                System.out.print(a+b);
            } else if (inx == 4||inx == 2) {
                a = Integer.parseInt(myArray[ina]);
                b = Integer.parseInt(myArray[inb]);
                System.out.print(a-b);
            } else {
                System.out.println("Ошибка");
                System.exit(0);
            }
        }
        else {
            System.out.println("Второй символ должен быть + или -");
            System.exit(0);
        }
    }
}