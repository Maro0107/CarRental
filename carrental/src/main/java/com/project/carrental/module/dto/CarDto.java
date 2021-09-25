package com.project.carrental.module.dto;

import com.project.carrental.module.entity.CarEntity;

import javax.persistence.Column;

public class CarDto {
    private Long id;
    private String brand;
    private String model;
    private String bodyType;
    private String colour;
    private Long prodDate;
    private Long mileage;
    private Long amount;
    private String status;

    public Long getId() {
        return id;
    }

    public CarDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarDto setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public CarDto setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBodyType() {
        return bodyType;
    }

    public CarDto setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public CarDto setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Long getProdDate() {
        return prodDate;
    }

    public CarDto setProdDate(Long prodDate) {
        this.prodDate = prodDate;
        return this;
    }

    public Long getMileage() {
        return mileage;
    }

    public CarDto setMileage(Long mileage) {
        this.mileage = mileage;
        return this;
    }

    public Long getAmount() {
        return amount;
    }

    public CarDto setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CarDto setStatus(String status) {
        this.status = status;
        return this;
    }
}
