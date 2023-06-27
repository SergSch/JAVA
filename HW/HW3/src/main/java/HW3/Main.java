package HW3;

public class Main {
    public static void main(String[] args) {
//      Создайте строку через new - I study Basic Java!
        String myStr = new String("I study Basic Java!");
        System.out.println(myStr);

//      Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
        String myStr1 = myStr;

//        Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println(myStr1.charAt(myStr1.length()-2));

//        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(myStr1.contains("Java"));

//        Вырезать строку Java c помощью метода String.substring().
        System.out.println(myStr1.substring(14,18));

//        Заменить все символы “а” на “о”.
        System.out.println(myStr1.replace('a', 'o'));

//        Преобразуйте строку к верхнему регистру.
        System.out.println(myStr1.toUpperCase());

//        Преобразуйте строку к нижнему регистру.
        System.out.println(myStr1.toLowerCase());


    }
}
