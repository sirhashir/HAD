package com.example.had.request;

import java.time.LocalDate;

public class userRegisterRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private LocalDate dob;
    private String contact;
    private String address;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

}
