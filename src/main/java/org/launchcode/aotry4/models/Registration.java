package org.launchcode.aotry4.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Registration {
    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private Date birthdate;
    private String password;
    private String confirmPassword;


    public Registration(String firstName, String lastName, Date birthdate, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public Registration() {

    }

    public int getId() {
        return id;
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
