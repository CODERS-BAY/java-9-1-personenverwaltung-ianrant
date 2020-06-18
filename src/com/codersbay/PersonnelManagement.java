package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class PersonnelManagement {

    private static List<Person> personList = new ArrayList<>();
    private static String status = "";


    public static List<Person> getPersonList() {
        return personList;
    }

    public static Person createPersonAllAttributes(int age, String firstName, String lastName, String nickname, String country, String city) {
        Person person = new Person(age, firstName, lastName, nickname, country, city);
        return person;
    }

    public static Person createPersonNameOnly(String firstName, String lastName, String nickname) {
        Person person = new Person(0, firstName, lastName, nickname, "unknown", "unknown");
        return person;
    }

    public static void addPersonToList(Person person) {
        personList.add(person);
    }

    public static String removePersonFromLIst(Person person) {
        status = person.getFirstName() + " " + person.getLastName() + " was removed";
        personList.remove(person);
        return status;
    }

    public static String removePersonAllAttributes(int age, String firstName, String lastName, String nickname, String country, String city) {

        for (int i = 0; i < personList.size(); i++) {
            if (
                    personList.get(i).getAge() == age &&
                            personList.get(i).getFirstName().equals(firstName) &&
                            personList.get(i).getLastName().equals(lastName) &&
                            personList.get(i).getNickname().equals(nickname) &&
                            personList.get(i).getCountry().equals(country) &&
                            personList.get(i).getCity().equals(city)
            ) {
                status = personList.get(i).getFirstName() + " " + personList.get(i).getLastName() + " was removed";
                getPersonList().remove(i);
            }
        }
        return status;
    }

    public static String removePersonNameOnly(String firstName, String lastName, String nickname) {
        for (int i = 0; i < personList.size(); i++) {
            if (
                    personList.get(i).getFirstName().equals(firstName) &&
                            personList.get(i).getLastName().equals(lastName) &&
                            personList.get(i).getNickname().equals(nickname)
            ) {
                status = personList.get(i).getFirstName() + " " + personList.get(i).getLastName() + " was removed";
                getPersonList().remove(i);
            }
        }
        return status;
    }


    @Override
    public String toString() {
        return "PersonnelManagement{" +
                "personList=" + personList +
                '}';
    }

}
