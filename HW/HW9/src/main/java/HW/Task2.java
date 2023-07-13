package HW;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99) + 5;
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        boolean max = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                max = false;
                break;
            }
        }
        if (max) {
            System.out.println("Массив строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не строго возрастающей последовательностью");
        }
    }
}
