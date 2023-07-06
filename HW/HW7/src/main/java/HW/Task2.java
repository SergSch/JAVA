package HW;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год ");
        int year = scanner.nextInt();
        isLeap(year);
    }

    public static void isLeap(int arg) {
        if (arg > 1584 && (arg % 400 == 0) || arg % 4 == 0 && arg % 100 != 0) {
            System.out.println("Год "+arg+" высокосный");
        } else {
            System.out.println("Год "+arg+" не высокосный");
        }
    }
}
