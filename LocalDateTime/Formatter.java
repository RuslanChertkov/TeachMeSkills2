package LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatter {
    public static void main(String[] args) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM dd, yy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("06 15, 18 12:10:56", formatter1);
        System.out.println(localDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm:ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse("июля 5, 2018 12:10:56", formatter2);
        System.out.println(localDateTime2);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm:ss", Locale.US);
        System.out.println(dateTime.format(formatter));
    }
}
