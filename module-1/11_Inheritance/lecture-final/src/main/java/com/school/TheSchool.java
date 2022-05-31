package com.school;

import java.util.ArrayList;
import java.util.List;

public class TheSchool {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person = new Person("mike", 1);
        people.add(person);

        Person student = new Student("doug", 2, "freshman");
        System.out.println(student.getName());
        people.add(student);

        GradStudent gs = new GradStudent("george", 3);
        Person pGs = gs;
        people.add(gs);

    }
}
