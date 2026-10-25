package com.java.assignment_1;

import java.util.Objects;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private char gender;

    //Default Constructor
    public Customer() {
    }

    //Parameterized Constructor
    public Customer(int id, String firstName, String lastName, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //toString()
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    //equals()
    @Override
    public boolean equals(Object o) {
        boolean areSame = false;

        Customer currentCustomer = (Customer)this;
        Customer otherCustomer = (Customer)o;

        int currentId = currentCustomer.getId();
        String currentFirstName = currentCustomer.getFirstName();
        String currentLastName = currentCustomer.getLastName();
        char currentGender = currentCustomer.getGender();

        int otherId = otherCustomer.getId();
        String otherFirstName = otherCustomer.getFirstName();
        String otherLastName = otherCustomer.getLastName();
        char otherGender = otherCustomer.getGender();

        if(currentId==otherId
                && currentFirstName.equals(otherFirstName)
                && currentLastName.equals(otherLastName)
                && currentGender==otherGender){
            areSame=true;
        }

        return areSame;
    }

}
