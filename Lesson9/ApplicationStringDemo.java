package Lesson9;

public class ApplicationStringDemo {
    public static void main(String[] args) {
        String string = "Igor Voitenko kachaet biceps 45";
        System.out.println(string);
        System.out.println();
        System.out.println(string.substring(string.indexOf("V"), string.lastIndexOf("s") + 1));

        System.out.println();
        System.out.println(string.replace(string.charAt(3), string.charAt(0)));

        System.out.println();
        String string2 = "Ishodnik\nfile\naboba\nkek\nnoga";
        System.out.println(string2);
        System.out.println();
        String[] s = string2.split("\n");
        for (int i = 0; i < s.length; i++) {
            if(isPolindrom(s[i])){
                System.out.println(s[i]);
            }
        }

    }

    private static boolean isPolindrom(String line) {
        StringBuilder builder = new StringBuilder(line);
        return builder.reverse().toString().equals(line);


    }

}