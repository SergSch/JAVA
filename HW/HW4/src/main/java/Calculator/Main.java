package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double myInt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo ");
        myInt = scanner.nextInt();
        double myInt1;
        System.out.println("Vvedite chislo ");
        myInt1 = scanner.nextInt();
        System.out.println("Itogo : " +(myInt + myInt1));
        System.out.println("Itogo : " +(myInt - myInt1));
        System.out.println("Itogo : " +(myInt * myInt1));
        System.out.println("Itogo : " +(myInt / myInt1));

    }
}
