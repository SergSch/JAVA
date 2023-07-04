package HW;

public class Task1 {
    public static void main(String[] args) {

    moreOrLess(9.35, 9.20);

    }
    static void moreOrLess(double m, double n) {
        if (n > 10 && m > 10) {
            if (n > m) {
                System.out.println("Число " + m + " ближе к 10.");
            } else {
                System.out.println("Число " + n + " ближе к 10.");
            };
        } else if (n < 10 && m < 10) {
            if (n > m) {
                System.out.println("Число "+n+" ближе к 10.");
            } else {
                System.out.println("Число "+m+" ближе к 10.");
            };
        };
    };
    };
