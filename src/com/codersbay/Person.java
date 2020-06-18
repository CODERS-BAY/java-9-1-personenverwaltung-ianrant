package com.codersbay;

public class Person {
    private Integer age;
    private String firstName;
    private String lastName;
    private String nickname;
    private String country;
    private String city;

    public Person(Integer age, String firstName, String lastName, String nickname, String country, String city) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.country = country;
        this.city = city;
    }

    public Person(String firstName, String lastName, String nickname) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
    }

    // GETTERS
    public Integer getAge() {
        return age;
    }

    // SETTERS
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // TO-STRING
    @Override
    public String toString() {
        return
                age +
                        " " + firstName +
                        " " + lastName +
                        " " + country +
                        " " + city;
    }

}
