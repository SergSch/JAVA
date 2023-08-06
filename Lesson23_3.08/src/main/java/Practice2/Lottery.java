package Practice2;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int setSize = 5;
        int range = 50;
        int lucky;
        int luckyCount;

        int lucky1 = 0;
        int lucky2 = 0;
        int lucky3 = 0;
        int lucky4 = 0;
        int lucky5 = 0;

        int userNum1;
        int userNum2;
        int userNum3;
        int userNum4;
        int userNum5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер от 1 до "+range);
        System.out.print("Введите 1й номер = ");
        userNum1 = scanner.nextInt();
        System.out.print("Введите 2й номер = ");
        userNum2 = scanner.nextInt();
        System.out.print("Введите 3й номер = ");
        userNum3 = scanner.nextInt();
        System.out.print("Введите 4й номер = ");
        userNum4 = scanner.nextInt();
        System.out.print("Введите 5й номер = ");
        userNum5 = scanner.nextInt();

        Random random = new Random();
        luckyCount = 1;
        for(int i = 0; i < setSize; i++) {
            lucky = random.nextInt(range);
            switch (luckyCount) {
                case 1:
                    lucky1 = lucky;
                    luckyCount++;
                    break;
                case 2:
                    if(lucky1 != lucky) {
                        lucky2 = lucky;
                        luckyCount++;
                    }
                    break;
                case 3:
                    if(lucky1 !=lucky && lucky2 != lucky) {
                        lucky3 = lucky;
                        luckyCount++;
                    }
                    break;
                case 4:
                    if(lucky1 !=lucky && lucky2 != lucky && lucky3 != lucky) {
                        lucky4 = lucky;
                        luckyCount++;
                    }
                    break;
                case 5:
                    if(lucky1 !=lucky && lucky2 != lucky && lucky3 != lucky && lucky4 != lucky) {
                        lucky5 = lucky;
                        luckyCount++;
                    }
            }
        }

        System.out.println("Счастливые номера: "+lucky1+","+lucky2+","+lucky3+","+lucky4+","+lucky5);
        System.out.println("Ваши номера: "+userNum1+","+userNum2+","+userNum3+","+userNum4+","+userNum5);
    }
}
