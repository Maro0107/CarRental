package com.project.carrental.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "body_type")
    private String bodyType;
    @Column(name = "colour")
    private String colour;
    @Column(name = "prod_date")
    private Long prodDate;
    @Column(name = "mileage")
    private Long mileage;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "status")
    private String status;

    public CarEntity(Long id, String brand, String model, String bodyType, String colour, Long prodDate, Long mileage, Long amount, String status) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.colour = colour;
        this.prodDate = prodDate;
        this.mileage = mileage;
        this.amount = amount;
        this.status = status;
    }

    public CarEntity() {
    }

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

    public String getBodyType() {
        return bodyType;
    }

    public CarEntity setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public CarEntity setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Long getProdDate() {
        return prodDate;
    }

    public CarEntity setProdDate(Long prodDate) {
        this.prodDate = prodDate;
        return this;
    }

    public Long getMileage() {
        return mileage;
    }

    public CarEntity setMileage(Long mileage) {
        this.mileage = mileage;
        return this;
    }

    public Long getAmount() {
        return amount;
    }

    public CarEntity setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CarEntity setStatus(String status) {
        this.status = status;
        return this;
    }

    public Long getId() {
        return id;
    }

    public CarEntity setId(Long id) {
        this.id = id;
        return this;
    }
}
