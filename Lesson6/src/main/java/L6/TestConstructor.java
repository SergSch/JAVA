package L6;

public class TestConstructor {
    public static void main(String[] args) {
        int myInt;
        myInt = 15;

        Test myTest;
        myTest = new Test();
        System.out.println(myTest.myIntTest);

        Test myTestWithParameter;
        myTestWithParameter = new Test(22);
        System.out.println(myTestWithParameter.myIntTest);

//        test.run();

//        outString( "Peredavaemaya stroka");
//        String myStr = "Mama mila ramu";
//        outString(myStr);
//        outTwoValue(myStr, 10);
//        outTwoValue("Peredavaemayz stroka", myInt);
    }

//    это метод
    static void outString(String inStr) {
        String localStr = inStr.toLowerCase();
        System.out.println("Our string -> "+inStr);
        System.out.println("localStr -> "+localStr);
    }

//    метод с двумя параметрами
    static void outTwoValue(String inStr, int inInt) {
        String localStr = inStr.toUpperCase();
        System.out.println("Our string -> "+inStr);
        System.out.println("Our number -> "+inInt);
        System.out.println("localStr -> "+localStr);
    }
}
