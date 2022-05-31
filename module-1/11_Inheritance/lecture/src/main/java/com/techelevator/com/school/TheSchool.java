package com.techelevator.com.school;

import java.util.ArrayList;
import java.util.List;

public class TheSchool {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person = new Person("mike", 1);
        people.add(person);

        Student student = new Student("doug", 2, "freshman");
        System.out.println(student.getName());
        people.add(student);

        Person gs = new GradStudent("george", 3); //this is legal bc it's a type hierarchy
        Person PGs = gs;
        people.add(gs);
    }
}
