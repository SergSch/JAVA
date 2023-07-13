package HW;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature1, temperature2;
        System.out.print("Введите температуру первой колбы = ");
        temperature1 = scanner.nextInt();
        System.out.print("Введите температуру второй колбы = ");
        temperature2 = scanner.nextInt();

        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
