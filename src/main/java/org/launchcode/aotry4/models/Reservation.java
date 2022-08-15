package org.launchcode.aotry4.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int id;

    private Date startDate;
    private Date endDate;
    private String equipment;
    private Double grandTotal;


    public Reservation(Date startDate, Date endDate, String equipment, Double grandTotal) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.equipment = equipment;
        this.grandTotal = grandTotal;
    }

    public Reservation() {

    }

    public int getId() {
        return id;
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
