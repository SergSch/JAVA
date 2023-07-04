package newPractice;

public class ChangeNumbers {
    public static void main(String[] args) {
        changeWithTemp(10, 25);
        changeWithoutTemp(10,25);
    }

    static void changeWithTemp(int arg1, int arg2) {
        System.out.println("Do: arg1 = "+arg1+" arg2 ="+arg2);
        int tempArg = arg1;
        arg1 = arg2;
        arg2 = tempArg;
        System.out.println("Posle: arg1 = "+arg1+" arg2 ="+arg2);
    }

    static void changeWithoutTemp(int arg1, int arg2) {
        System.out.println("Do: arg1 = "+arg1+" arg2 ="+arg2);
        arg1 = arg1 + arg2;
        arg2 = arg1 - arg2;
        arg1 = arg1 - arg2;
        System.out.println("Posle: arg1 = "+arg1+" arg2 ="+arg2);
    }
}
