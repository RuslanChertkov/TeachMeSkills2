package StringLesson9;

import java.util.Locale;
import java.util.Scanner;

public class Task1_10 {

    public static void main(String[] args) {
        //1) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”
        System.out.println("Введите текст:");
        Scanner sc = new Scanner(System.in);
        String str = new String(sc.nextLine());
        System.out.println(str);
        System.out.println("--------------------");

        // 2) Распечатать последний символ строки. Используем метод String.charAt()
        String str1 = "Hello Java";
        System.out.println(str1.charAt(str1.length() - 1));
        System.out.println("--------------------");

        // 3) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().


        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str2 = new String(sc2.nextLine());
        boolean flag = true;
        if (str2.endsWith("!!!") == flag) {
            System.out.println("Строка содержит такую подстроку!");
        } else {
            System.out.println("Такой подстроки нет!");
        }
        System.out.println("--------------------");

        // 4)  Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println("Введите строку:");
        Scanner sc3 = new Scanner(System.in);
        String str3 = new String(sc3.nextLine());
        boolean flag3 = true;
        if (str3.startsWith("I like") == flag3) {
            System.out.println("Строка содержит такую подстроку!");
        } else {
            System.out.println("Такой подстроки нет!");
        }
        System.out.println("--------------------");

        // 5) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println("Введите строку:");
        Scanner sc4 = new Scanner(System.in);
        String str4 = sc.nextLine();
        boolean word = true;
        if (word == str4.contains("Java")) {
            System.out.println("Такое слово есть в строке!");
        } else {
            System.out.println("Такого слова нет!");
        }
        System.out.println("--------------------");

        // 6) Найти позицию подстроки “Java” в строке “I like Java!!!”.

        String str5 = "I like Java!!!";
        int index = str5.lastIndexOf("Java");
        System.out.println(index);
        System.out.println("--------------------");

        // 7) Заменить все символы “а” на “о”.

        String str6 = "Arnold want to play with yaamy";
        System.out.println(str6);
        String newStr = str6.replace("a", "o");
        System.out.println(newStr);
        System.out.println("--------------------");

        // 8) Преобразуйте строку к верхнему регистру.
        System.out.println("Введите строку:");
        Scanner sc8 = new Scanner(System.in);
        String str8 = new String(sc8.nextLine());
        System.out.println(str8.toUpperCase());
        System.out.println("--------------------");

        // 9) Преобразуйте строку к нижнему регистру.

        String str9 = "I PLAY WiTh YoU";
        System.out.println(str9.toLowerCase());
        System.out.println("--------------------");

        // 10) Вырезать строку Java c помощью метода String.substring().
        String str10 = "Java plays a huge role in my life";
        System.out.println(str10.substring(0, 4));

    }
}
