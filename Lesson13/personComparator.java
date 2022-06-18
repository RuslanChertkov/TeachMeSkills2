package Lesson13;

import java.time.LocalDate;
import java.util.Comparator;

public class personComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getBirthDay().isAfter(o2.getBirthDay())) {
            return 1;

        }
        if (o1.getBirthDay().isBefore(o2.getBirthDay())) {
            return -1;
        } else {
            return 0;
        }

    }
}
