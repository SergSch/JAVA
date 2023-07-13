package HW;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько у вас денег на счету = ");
        int amount = scanner.nextInt();
        int days = calculateDays(amount);
        System.out.println("Вам потребуется " + days + " дней, чтобы забрать все деньги из банка");
    }

    public static int calculateDays(int amount) {
        int days = 0;

        while (amount > 1) {
            int maxWithDivide = 1;

            for (int i = 1; i < amount; i++) {
                if (amount % i == 0) {
                    maxWithDivide = Math.max(maxWithDivide, i);
                }
            }

            amount -= maxWithDivide;
            days++;
        }

        return days;
    }
}
