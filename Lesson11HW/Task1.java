package Lesson11HW;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Palindrom.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                String[] word = str.split("\n");
                for (String s : word) {
                    if (isPalindrom(s)) {
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter("newPalindrom.txt"))) {
                            bw.write(s);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    private static boolean isPalindrom(String line) {
        StringBuilder builder = new StringBuilder(line);
        return builder.reverse().toString().equals(line);
    }


}