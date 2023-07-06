package Lesson;

import java.util.Scanner;

public class WorkDayOrDayOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число = ");
        String outNameDame = "";
        outNameDame = getNameWorkDayOrDayOff(scanner.nextInt());
        System.out.println("Статус дня = "+outNameDame);
    }

    static String getNameWorkDayOrDayOff(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Некорректное входящее число!");
            return "День недели должен быть от 1 .. 7";
        }
        String nameDayOfWeek = "";
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                nameDayOfWeek = "Рабочий день";
                break;
            }
            case 6:
            case 7: {
                nameDayOfWeek = "Выходной день";
                break;
            }
            default:
                nameDayOfWeek = "Некоректное число";
        }
        return nameDayOfWeek;
    }
}
