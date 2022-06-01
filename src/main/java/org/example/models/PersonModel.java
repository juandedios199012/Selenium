package org.example.models;

import com.github.javafaker.Faker;

public class PersonModel {
    private final String name;
    private final String lastName1;
    private final String lastName2;
    private final String zipCode;
    private final String email;
    private final String country;

    public PersonModel() {
        var faker = new Faker();
        name = faker.name().firstName();
        lastName1 = faker.name().lastName();
        lastName2 = faker.name().lastName();
        zipCode = faker.address().zipCode();
        email = faker.internet().emailAddress();
        country = faker.address().country();
    }

    public String getName() {
        return name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }
}
