package Lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternIPv4 {
    public static void main(String[] args) {
        System.out.println(isIPv4("255.255.255.00 "));
    }
    public static boolean isIPv4(String input){
        Pattern pattern = Pattern.compile("((0{2}[1-9])|(0[1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5])\\.){3}(1[0-6]|0[1-6])");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
    /*boolean result = input.matches("(([0-2][0-5][0-5])|([0-2][0-4][0-9])|([0-1][0-9][0-9]))&&([^0{3}])");*/