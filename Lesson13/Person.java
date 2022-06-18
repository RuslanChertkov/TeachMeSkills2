package Lesson13;

import java.time.LocalDate;

public class Person {
    private String name;
    private String lastName;
    private LocalDate birthDay;

    public Person(){

    }

    public Person(String name, String lastName, LocalDate birthDay){
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
