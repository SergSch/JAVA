package org.example;

public class Main {
    public static void main(String[] args) {
        int Num = 345;
        int Num1 = Num / 100 % 10;
        int Num2 = Num / 10 % 10;
        int Num3 = Num % 10;
        System.out.println("Number is -> " + Num1 +"," + Num2 + "," + Num3);
    }
}