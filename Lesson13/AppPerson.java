package Lesson13;

import java.time.LocalDate;
import java.util.*;

public class AppPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Oleg", "Ivanov", LocalDate.of(1999, 6, 13));
        Person person2 = new Person("Ivan", "Gnomov", LocalDate.of(1994, 2, 18));
        Person person3 = new Person("Sasha", "Alekseev", LocalDate.of(2005, 4, 7));
        Person person4 = new Person("Nikita", "Artyomov", LocalDate.of(2001, 8, 26));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);



        for(Person el : personList){
            System.out.println(el);
        }
        System.out.println("-------------");
        personComparator comparator = new personComparator();
        personList.sort(comparator);

        for(Person el : personList){
            System.out.println(el);
        }
    }
}
