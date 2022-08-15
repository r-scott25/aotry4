package org.launchcode.aotry4.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "registration_id")
    private Registration registration;

    private List<Reservation> reservations = new ArrayList<>();

    public Registration getRegistration() {
        return registration;
    }

    public Account() {

    }

    public int getId() {
        return id;
    }

//    public Account(Registration aRegistration, List<Reservation> someReservations);
//
//    public Registration getRegistration() {
//        return registration;
//    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
