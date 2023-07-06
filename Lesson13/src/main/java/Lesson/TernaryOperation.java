package Lesson;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        int currentTime, start1, end1, start2, end2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Старт работы перевого магазина = ");
        start1 = scanner.nextInt(24);
        System.out.print("Окончание работы перевого магазина = ");
        end1 = scanner.nextInt(24);
        System.out.print("\nСтарт работы второго магазина = ");
        start2 = scanner.nextInt(24);
        System.out.print("Окончание работы второго магазина = ");
        end2 = scanner.nextInt(24);

        System.out.println("\nВведите текущее время = ");
       currentTime = scanner.nextInt(24);

       workingShop1(start1, end1, currentTime);
       workingShop2(start2, end2, currentTime);

    }
    static void workingShop1(int start, int end, int currentTime) {
        String outMessage;
        if(currentTime>=start && currentTime<end)
            outMessage = "Магазин1 работает";
        else outMessage = "Магазин1 не работает";
        System.out.println(outMessage);
    }

    static void workingShop2(int start, int end, int currentTime) {
        String outMessage = (currentTime>=start && currentTime<end) ? "Магазин2 работает" : "Магазин2 не работает";
        System.out.println(outMessage);
    }
}
