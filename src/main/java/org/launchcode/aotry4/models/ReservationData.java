package org.launchcode.aotry4.models;

import java.util.ArrayList;

public class ReservationData {

    static ArrayList<Reservation> reservations = new ArrayList<>();

    // getAll
    public static ArrayList<Reservation> getAll() {
        return reservations;
    }

    //add
    public static void add(Reservation newReservation) {
        reservations.add(newReservation);
    }

    //remove
public static void remove(int id) {
        Reservation reservationToRemove = getById(id);
        reservations.remove(reservationToRemove);
}

    //getById
    public static Reservation getById(int id) {
        Reservation theReservation = null;

        for (Reservation candidateReservation : reservations) {
            if(candidateReservation.getReservationId() == id) {
                theReservation = candidateReservation;
            }
        }
        return theReservation;
    }
}
