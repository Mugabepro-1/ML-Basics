package org.mupro.springbootapi.model;

import jakarta.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private int roomNumber;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person bookingPerson;

    @Column(nullable = false)
    private int cost;

    public Booking(){}

    public Booking(int roomNumber, int cost, Person bookingPerson) {
        this.roomNumber = roomNumber;
        this.cost = cost;
        this.bookingPerson = bookingPerson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Person getBookingPerson() {
        return bookingPerson;
    }

    public void setBookingPerson(Person bookingPerson) {
        this.bookingPerson = bookingPerson;
    }
}
