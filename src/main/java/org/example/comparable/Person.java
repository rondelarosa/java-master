package org.example.comparable;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        name = name;
        age = age;
    }

    @Override
    public int compareTo(Person person) {
        int compare = name.compareTo(person.name);
        return compare != 0 ? compare : person.age - age;
    }
}
