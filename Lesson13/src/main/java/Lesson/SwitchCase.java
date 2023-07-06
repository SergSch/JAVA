package Lesson;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число = ");
        String outNameDay = getNameDayOfWeekIfElse(scanner.nextInt());
        System.out.println("Имя дня недели = " + outNameDay);

        System.out.print("\nВведите число = ");
        outNameDay = getNameDayOfWeekSwitchCase(scanner.nextInt());
        System.out.println("Имя дня недели = " + outNameDay);
    }

    static String getNameDayOfWeekIfElse(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Некорректное входящее число!");
            return "День недели должен быть от 1 .. 7";
        }
        String nameDayOfWeek = "";
        if (dayOfWeek == 1) nameDayOfWeek = "Monday";
        else if (dayOfWeek == 2) nameDayOfWeek = "Thuesduy";
        else if (dayOfWeek == 3) nameDayOfWeek = "Wensday";
        else if (dayOfWeek == 4) nameDayOfWeek = "Thursday";
        else if (dayOfWeek == 5) nameDayOfWeek = "Friday";
        else if (dayOfWeek == 6) nameDayOfWeek = "Saturday";
        else if (dayOfWeek == 7) nameDayOfWeek = "Sunday";
        else nameDayOfWeek = "Некорректное число";

        return nameDayOfWeek;
    }

    static String getNameDayOfWeekSwitchCase(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Некорректное входящее число!");
            return "День недели должен быть от 1 .. 7";
        }
        String nameDayOfWeek = "";
        switch (dayOfWeek) {
            case 1: {
                nameDayOfWeek = "Monday";
                break;
            }
            case 2: {
                nameDayOfWeek = "Thuesduy";
                break;
            }
            case 3: {
                nameDayOfWeek = "Wensday";
                break;
            }
            case 4: {
                nameDayOfWeek = "Thursday";
                break;
            }
            case 5: {
                nameDayOfWeek = "Friday";
                break;
            }
            case 6: {
                nameDayOfWeek = "Saturday";
                break;
            }
            case 7: {
                nameDayOfWeek = "Sunday";
                break;
            }
            default:
                nameDayOfWeek = "Некоректное число";
        }
        return nameDayOfWeek;
    }
}
