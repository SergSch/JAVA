package Practice;

public class MyType {
    public static void main(String[] args) {
        byte myByte = 64;
        int MyInt = myByte;

        long myLong = 456;
        myByte = (byte)myLong;
        System.out.println(myLong);
        System.out.println(myByte);

    }
}
