package Practice;

public class StackHeap {
    public static void main(String[] args) {
/*        int myInt1 = 10;
        Test test1 = new Test();
        String myStr1 = new String("My String");
        String myStr2 = "My String";*/
/*
        int myInt2 = myInt1;
        System.out.println(myInt1 + " --- "+myInt2);
        myInt2 = 20;
        System.out.println(myInt1 + " --- "+myInt2);

        Test test2 = test1;
        System.out.println(test1.myIntTest + " --- "+test2.myIntTest);

        test2.myIntTest = 55;
        System.out.println(test1.myIntTest + " --- "+test2.myIntTest);

        String myStr3 = "My String";
        String myStr4 = myStr3;
        System.out.println(myStr3 + " --- "+myStr4);
*/
/*        int myInt1 = 10;
        long myLong = 10L;
        Test test1 = new Test();

        String myStr1 = new String("My String");
        String myStr2 = "My String";
        myStr2 = "Новая строка";
        char c = 'r';
        myStr2 =  new String("Новая строка");
        System.out.println(myStr2);
        System.out.println(myStr2.length());*/

    String myStr1 = "Новая строка";
        System.out.println(myStr1.length());                       // длина строки
        System.out.println(myStr1.charAt(7));
        System.out.println(myStr1.charAt(myStr1.length()-1));    //последняя символ строки
        System.out.println(myStr1.substring(0,5));
        String myStr2 = myStr1.substring(6);
        System.out.println(myStr2);

        char c = '\n';
        System.out.println(Character.hashCode(c));

        System.out.println("My String \n"+myStr2);
    }
}
