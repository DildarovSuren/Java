package com.max.idea;
import java.util.Scanner;
public class Likejava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите: I like Java!!!");
        String x = in.nextLine();
        boolean result = x.contains("Java");
        boolean result2 = x.startsWith("I like");
        boolean result3 = x.endsWith("!!!");

        if (result&result2&result3) {
            String result4 = x.toUpperCase();
            System.out.println(result4);
        }

        String result5 = x.replace("a","o");
        String result6 = result5.substring(7,11);
        System.out.println(result6);

    }
}