package com.project.carrental.module.car;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
//    @Column(name = "bodyType")
//    private String bodyType;
    @Column(name = "colour")
    private String colour;
//    @Column(name = "prodDate")
//    private int prodDate;
//    @Column(name = "mileage")
//    private int mileage;
//    @Column(name = "amount")
//    private int amount;
//    @Column(name = "status")
//    private String status;

    public String getBrand() {
        return brand;
    }

    public CarEntity setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public CarEntity setModel(String model) {
        this.model = model;
        return this;
    }

//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public CarEntity setBodyType(String bodyType) {
//        this.bodyType = bodyType;
//        return this;
//    }

    public String getColour() {
        return colour;
    }

    public CarEntity setColour(String colour) {
        this.colour = colour;
        return this;
    }

//    public int getProdDate() {
//        return prodDate;
//    }
//
//    public CarEntity setProdDate(int prodDate) {
//        this.prodDate = prodDate;
//        return this;
//    }
//
//    public int getMileage() {
//        return mileage;
//    }
//
//    public CarEntity setMileage(int mileage) {
//        this.mileage = mileage;
//        return this;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public CarEntity setAmount(int amount) {
//        this.amount = amount;
//        return this;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public CarEntity setStatus(String status) {
//        this.status = status;
//        return this;
//    }
}
