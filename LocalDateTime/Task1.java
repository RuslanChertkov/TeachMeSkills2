package LocalDateTime;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2002, 7, 19);
        System.out.println("Birthday: " + birthday);
        LocalDate today = LocalDate.now();
        System.out.println("Today:" + today);
        System.out.println(birthday.isAfter(today));
        System.out.println(birthday.isBefore(today));
    }
}
