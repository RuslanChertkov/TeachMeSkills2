package Lesson13;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class PersonHandler {
  public List<Person> sortByAge (List<Person> people){
      LocalDate now = LocalDate.now();
      List <Person> result = new ArrayList<Person>();
      for(Person el: people){
          Period date = Period.between(now, el.getBirthDay());
          if(date.getYears()>30);
          result.add(el);
      }
      return result;
  }

}
