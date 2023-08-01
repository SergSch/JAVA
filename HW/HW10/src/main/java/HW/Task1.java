package HW;

public class Task1 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 5};
        int [] arr2 = {6,1,2,8,3,4,7,10,5};
        System.out.println(findElement(arr1));
        System.out.println(findElement(arr2));
    }

    public static int findElement(int[] arr) {
        int n = arr.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n + 1; i++) {
            sum1 += i + 1;
        }
        for(int i = 0; i < n; i++) {
            sum2 += arr[i];
        }
        int missingElement = sum1 - sum2;
        return missingElement;
    }
}
