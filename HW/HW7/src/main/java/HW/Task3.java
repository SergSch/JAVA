package HW;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int arg1 = scanner.nextInt();
        System.out.println("Введите еще число ");
        int arg2 = scanner.nextInt();
        System.out.println("Введите еще одно число ");
        int arg3 = scanner.nextInt();

        int big = Math.max(Math.max(arg1, arg2), arg3);
        System.out.println("Самое большое = "+big);
    }
}
