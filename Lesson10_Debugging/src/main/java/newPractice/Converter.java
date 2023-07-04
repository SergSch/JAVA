package newPractice;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите темпереатуру в градусах по Цельсию = " );
        int tempNumber = scanner.nextInt();
        System.out.println("Температура в Кельвинач = "+runKelvinConverter(tempNumber));
        System.out.println("Температура в Фаренгейте0 = "+runFahrenheitConverter(tempNumber));
    }

    static double runKelvinConverter(double baseValue) {
        return baseValue + 273;
    }

    static double runFahrenheitConverter(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
