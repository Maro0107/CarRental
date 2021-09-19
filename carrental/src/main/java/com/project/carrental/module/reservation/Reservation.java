package com.project.carrental.module.reservation;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "dateReservation")
    private java.sql.Date dateReservation;
    @Column(name = "client")
    private String client;
    @Column(name = "car")
    private String car;
    @Column(name = "dateFrom")
//    private java.sql.Date dateFrom;
    private Date dateFrom;
    @Column(name = "dateTo")
    private java.sql.Date dateTo;
    @Column(name = "rentDepartment")
    private String rentDepartment;
    @Column(name = "departmentBack")
    private String departmentBack;
    @Column(name = "amount")
    private double amount;


    public Date getDateReservation() {
        return dateReservation;
    }

    public Reservation setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
        return this;
    }

    public String getClient() {
        return client;
    }

    public Reservation setClient(String client) {
        this.client = client;
        return this;
    }

    public String getCar() {
        return car;
    }

    public Reservation setCar(String car) {
        this.car = car;
        return this;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public Reservation setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public Reservation setDateTo(Date dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public String getRentDepartment() {
        return rentDepartment;
    }

    public Reservation setRentDepartment(String rentDepartment) {
        this.rentDepartment = rentDepartment;
        return this;
    }

    public String getDepartmentBack() {
        return departmentBack;
    }

    public Reservation setDepartmentBack(String departmentBack) {
        this.departmentBack = departmentBack;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Reservation setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}
