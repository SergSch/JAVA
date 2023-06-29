package PartOne;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite slovo : ");
        String myStr1 = scanner.nextLine();

        System.out.println("Vvedite slovo : ");
        String myStr2 = scanner.nextLine();

        if (myStr1.length() % 2 == 0 && myStr2.length() % 2 == 0) {
            System.out.println(myStr1.substring(0, myStr1.length() / 2) + myStr2.substring(myStr2.length() / 2));
        }
    }
}
