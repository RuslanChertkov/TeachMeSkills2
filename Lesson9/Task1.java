package Lesson9;

public class Task1 {
    public static void main(String[] args) {

//task1(1)
        System.out.println("Task 1(1)");
        StringBuffer string = new StringBuffer("Voitenko kachaet biceps");
        System.out.println(string);
        int startIndex = 9;
        int endIndex = 16;
        char[] buffer = new char[endIndex - startIndex];
        string.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer);
        System.out.println();

        //task1(2)
        System.out.println("Task1(2)");
        String string1 = "Voitenko kachaet biceps";
        System.out.println(string1);
        System.out.println(string1.substring(9, 16));
        System.out.println();

        //task1(3)
        System.out.println("Task 1(3)");
        String string2 = "Voitenko kachaet biceps";
        System.out.println(string2);
        System.out.println(string2.substring(string2.indexOf("k", 9), string2.lastIndexOf("t") + 1));
        System.out.println();

//task2
        System.out.println("Task 2");
        String stringg = "i want to live in London if arnold compare some problems";
        System.out.println(stringg);
        System.out.println(stringg.replace(stringg.charAt(3), stringg.charAt(0)));
        System.out.println();

        //task3
        System.out.println("Task 3");
        String palindromString = "madam\nlevel\nten\naboba";
        System.out.println(palindromString);
        System.out.println();
        String[] word = palindromString.split("\n");
        for (int i = 0; i < word.length; i++) {
            if (isPalindrom(word[i])) {
                System.out.println(word[i]);
            }
        }
    }

    private static boolean isPalindrom(String line) {
        StringBuilder builder = new StringBuilder(line);
        return builder.reverse().toString().equals(line);
    }




}
