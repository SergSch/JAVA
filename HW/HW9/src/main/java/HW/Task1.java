package HW;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = new int[8];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50) + 1;
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = 0;
            };
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        }
    }
