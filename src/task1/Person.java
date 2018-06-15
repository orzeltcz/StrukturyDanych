package task1;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private static Set<Person> listOfUniquePerson = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, age);
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public static void addPersonToList(String[] listOfPersons){

       listOfUniquePerson.add(new Person(listOfPersons[0],listOfPersons[1],Integer.parseInt(listOfPersons[2])));
    }

    public static void print(){
        for (Person print : listOfUniquePerson) {
            System.out.println(print.name+" "+print.surname+" "+print.age.toString());
        }
        System.out.println(listOfUniquePerson.size());
    }

    public static void main(String[] args) throws IOException {
        String[] listOfPersons;
        List<String> ListOfNames;
        ListOfNames= Files.readAllLines(Paths.get("set.txt"));
        for (String a : ListOfNames) {
            listOfPersons = a.split(" ");
            addPersonToList(listOfPersons);
        }
        print();

    }

}
