package HW;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int start1, start2, end1, end2, currentTime = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Старт работы магазина Edeka = ");
        start1 = scanner.nextInt(24);
        System.out.print("Окончание работы магазина Edeka = ");
        end1 = scanner.nextInt(24);
        System.out.print("\nСтарт работы магазина Rewe = ");
        start2 = scanner.nextInt(24);
        System.out.print("Окончание работы магазина Rewe = ");
        end2 = scanner.nextInt(24);

        System.out.println("\nВведите текущее время = ");
        currentTime = scanner.nextInt(24);

        boolean isEdekaOpen, isReweOpen = true;

        if (currentTime >= start1 && currentTime<=end1) {
            isEdekaOpen = true;
        } else {
            isEdekaOpen = false;
        }

        if (currentTime >= start2 && currentTime<=end2) {
            isReweOpen = true;
        } else {
            isReweOpen = false;
        }
        cunBuy(isEdekaOpen, isReweOpen);
    }

    public static void cunBuy(boolean val1, boolean val2){
        if(val1 == true && val2 == true) {
            System.out.println("Я могу купить еду в Edeka и Rewe");
        } else if (val1 == false && val2 == false) {
            System.out.println("Остаюсь голодным");
        } else if (val1 == true || val2 == false) {
            System.out.println("Я могу купить еду в Edeka");
        } else if (val1 == false || val2 == true) {
            System.out.println("Я могу купить еду в Rewe");
        }
    }
}
