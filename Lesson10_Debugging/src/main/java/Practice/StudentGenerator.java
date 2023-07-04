package Practice;

import java.util.Random;

public class StudentGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int numStudent = random.nextInt(25) +1;
        System.out.println("Number of student = "+numStudent);
        System.out.println("Summe of student = " + sumTwoNum(numStudent ,5));
        System.out.println("Divide of student = " + divideTwoNumbers(numStudent ,2));
        System.out.println("Divide of student throw double= " + divideTwoDoubleInt(numStudent ,2));
        System.out.println("Divide of student on 0= " + divideTwoNumbers(numStudent ,0));
    }

    static int sumTwoNum(int arg1, int arg2) {
        int sumLocal = arg1 + arg2;
        return sumLocal;
    }

    static double divideTwoNumbers(int arg1, int arg2) {
        double divLocal = (double)arg1 / arg2;
        return divLocal;
    }

    static double divideTwoDoubleInt(double arg1, int arg2) {
        double divLocal = arg1 / arg2;
        return divLocal;
    }
}
