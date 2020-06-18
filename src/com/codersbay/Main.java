package com.codersbay;

public class Main {

    public static void main(String[] args) {

        /*
        This exercise is supposed to illustrate the following concept:
        new objects of a certain datatype can also be created outside the main class
        for this purpose we put

         */

        Person martin = PersonnelManagement.createPersonAllAttributes(31, "Martin", "Frank", "Matze", "Germany", "Bonn");
        Person andrea = PersonnelManagement.createPersonAllAttributes(24, "Andrea", "Bauer", "Andy", "Austria", "Salzburg");
        Person martha = PersonnelManagement.createPersonAllAttributes(28, "Martha", "Steward", "Mar", "US of A", "New York City");
        Person kyle = PersonnelManagement.createPersonAllAttributes(35, "Kyle", "Grest", "K-ster", "US of A", "Austin");
        Person karen = PersonnelManagement.createPersonAllAttributes(45, "Middle Aged Karen", "Meisner", "I want to talk to the manager", "US of A", "Middlesboro");
        Person bob = PersonnelManagement.createPersonAllAttributes(47, "Bob", "Meisner", "My wife wants to talk to the manager", "US of A", "Middlesboro");

        Person mai = PersonnelManagement.createPersonNameOnly("Mai", "Xyfang", "Mao's Favorite");
        Person ming = PersonnelManagement.createPersonNameOnly("Ming Li", "Fu", "Ming Vase");
        Person karenInRetirement = PersonnelManagement.createPersonNameOnly("Aaaaancient Karen", "Meisner", "lacks hobbies other than complaining");
        Person keith = PersonnelManagement.createPersonNameOnly("Keith", "Thief", "ththth");


        PersonnelManagement.addPersonToList(martin);
        PersonnelManagement.addPersonToList(andrea);
        PersonnelManagement.addPersonToList(martha);
        PersonnelManagement.addPersonToList(kyle);
        PersonnelManagement.addPersonToList(karen);
        PersonnelManagement.addPersonToList(bob);
        PersonnelManagement.addPersonToList(mai);
        PersonnelManagement.addPersonToList(ming);
        PersonnelManagement.addPersonToList(karenInRetirement);
        PersonnelManagement.addPersonToList(keith);

        //TestClass.testMethod();

        for (Person person : PersonnelManagement.getPersonList()) {
            System.out.println("next person is ==> " + person.toString());
        }

        System.out.println();
        System.out.println(PersonnelManagement.removePersonFromLIst(karen) + " was removed");
        System.out.println(PersonnelManagement.removePersonFromLIst(karenInRetirement) + " was removed");
        System.out.println(PersonnelManagement.removePersonNameOnly("Keith", "Thief", "ththth"));
        System.out.println(PersonnelManagement.removePersonNameOnly("Ming Li", "Fu", "Ming Vase"));

        System.out.println(PersonnelManagement.removePersonAllAttributes(35, "Kyle", "Grest", "K-ster", "US of A", "Austin"));
        System.out.println(PersonnelManagement.removePersonAllAttributes(28, "Martha", "Steward", "Mar", "US of A", "New York City"));


    }

}
