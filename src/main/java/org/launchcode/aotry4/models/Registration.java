package org.launchcode.aotry4.models;


import java.util.Date;


public class Registration {

    private String firstName;
    private String lastName;
    private Date birthdate;
    private String password;
    private String confirmPassword;
    private int userId;
    private static int nextId = 1;

    public Registration(String firstName, String lastName, Date birthdate, String password, String confirmPassword) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public Registration() {
        userId = nextId;
        nextId++;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private String getConfirmPassword() {
        return confirmPassword;
    }

    private void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
