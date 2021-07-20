package com.max.idea;
import java.util.Scanner;
import java.util.Arrays;
public class Wordz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введте слова разделенные пробелами: ");
        String x = in.nextLine();
        String[] myArray = x.split(" ");
        int j = 0;
        System.out.println(Arrays.deepToString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            String sl = myArray[i];
            boolean check = sl.matches("^[a-zA-Z]+$");
            if (check) {
                System.out.println(myArray[i]);
                j = j + 1;
            }
        }
        System.out.println("Количество латинских слов: " + j);
    }
}