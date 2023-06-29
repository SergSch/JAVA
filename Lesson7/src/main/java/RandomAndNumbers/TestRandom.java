package RandomAndNumbers;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
    public static void main(String[] args) {
        int myInt = 5;
        System.out.println(myInt);

        Scanner scanner = new Scanner(System.in);
        myInt = scanner.nextInt();
        System.out.println(myInt);

        Random random = new Random();
        myInt = random.nextInt();
        System.out.println(myInt);

        double myDbl = random.nextDouble();
        System.out.println(myDbl);

        float myFlt = random.nextFloat();
        System.out.println(myFlt);
    }
}
