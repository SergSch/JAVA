package HW;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28800)+1;
        endWorksDay(n);
    }

    static void endWorksDay (int secundes) {
    int hours = secundes / 60;
    Math.round(hours);
    if (hours == 0) {
        System.out.println("Рабочий день закончился");
    } else if (hours > 1 && hours < 60) {
        System.out.println("Осталось работать менее часа");
    } else if (hours >= 60 && hours < 120) {
        System.out.println("Остался 1 час");
    } else if (hours >= 120 && hours < 300) {
        int hoursMoreThan2 = hours / 60;
        Math.round(hoursMoreThan2);
        System.out.println("Осталось "+hoursMoreThan2+" часа");
    } else if (hours >= 300) {
        int hoursMoreThan5 = hours / 60;
        Math.round(hoursMoreThan5);
        System.out.println("Осталось "+hoursMoreThan5+" часов");
    }
    }
}
