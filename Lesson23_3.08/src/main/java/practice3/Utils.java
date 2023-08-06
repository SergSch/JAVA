package practice3;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;
import java.util.SortedMap;

public class Utils {
    public static int[] getUserLotteryNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[Constants.COUNT_SET_SIZE];
        for(int i = 0; i < Constants.COUNT_SET_SIZE; i++) {
            do {
                System.out.print("Введите "+(i+1)+"-й номер = ");
                userNumbers[i] = scanner.nextInt();
            } while(userNumbers[i] <= 0 || userNumbers[i] > 50);
        }
        return userNumbers;
    }
}
