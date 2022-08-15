package org.launchcode.aotry4.models;

import java.util.ArrayList;

public class RegistrationData {

    static ArrayList<Registration> registrations = new ArrayList<>();

    // getAll
    public static ArrayList<Registration> getAll() {
        return registrations;
    }

    //add
    public static void add(Registration newRegistration) {
        registrations.add(newRegistration);
    }

    //remove
    public static void remove(int id) {
        Registration registrationToRemove = getById(id);
        registrations.remove(registrationToRemove);
    }

    //getById
    public static Registration getById(int id) {
        Registration theRegistration = null;

        for (Registration candidateRegistration : registrations) {
            if(candidateRegistration.getUserId() == id) {
                theRegistration = candidateRegistration;
            }
        }
        return theRegistration;
    }
}
