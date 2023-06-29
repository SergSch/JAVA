package practice.modifiers;

public class OurMethods {
    public static void main(String[] args) {
        sumConsole(1, 2);
        sumConsole(10, 25);
        int sum = sumReturnResult(12,3);
        System.out.println(sum);
    }

    static void sumConsole(int arg1, int arg2) {
        int sum = arg1 + arg2;
        System.out.println("Summe = "+sum);
    }

    static int sumReturnResult(int arg1, int arg2) {
        int sum = arg1 + arg2;
        return sum;
    }
}
