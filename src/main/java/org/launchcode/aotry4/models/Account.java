package org.launchcode.aotry4.models;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {

    private Registration registration;

    private List<Reservation> reservations = new ArrayList<>();

    public Account(){

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
