package org.launchcode.aotry4.models;

import java.net.PasswordAuthentication;
import java.util.Date;

public class Reservation {
    private Date startDate;
    private Date endDate;
    private String equipment;
    private Double grandTotal;
    private int reservationId;
    private static int nextId = 1;

    public Reservation(Date startDate, Date endDate, String equipment, Double grandTotal) {
        this();
        this.startDate = startDate;
        this.endDate = endDate;
        this.equipment = equipment;
        this.grandTotal = grandTotal;
    }

    public Reservation() {
reservationId = nextId;
nextId++;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public Number getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }
}
