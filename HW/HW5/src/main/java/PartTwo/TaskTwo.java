package PartTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        System.out.println(sumResult());
//        System.out.println(minusResult());
    }
    static double sumResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo : ");
        double arg1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Vvedite chislo : ");
        double arg2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What do you want? : ");
        String arg3 = scanner.nextLine();
        double sum = 0;

        if (arg3.equals("+")) {
            sum = arg1 + arg2;
        } else if (arg3.equals("-")) {
            sum = arg1 - arg2;
        } else if (arg3.equals("*")) {
            sum = arg1 * arg2;
        } else if (arg3.equals("/")) {
            sum = arg1 / arg2;
        }
        return sum;
    }

}
