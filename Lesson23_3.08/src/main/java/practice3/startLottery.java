package practice3;

import java.util.Arrays;

public class startLottery {
    public static void main(String[] args) {
        int[] userNumbers = Utils.getUserLotteryNumbers();
        System.out.println(Arrays.toString(userNumbers));
    }
}
