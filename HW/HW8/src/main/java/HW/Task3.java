package HW;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int temperature1 = random.nextInt(200);
        int temperature2 = random.nextInt(200) - 200;
        System.out.println(calcTemp(temperature1, temperature2));
    }

    static boolean calcTemp(int temperature1, int temperature2) {
         return (temperature1 > 100 && temperature2 < 100);

    }
}
