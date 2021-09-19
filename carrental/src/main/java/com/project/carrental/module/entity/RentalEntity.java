package com.project.carrental.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "rental")
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "name")
    private String name;
    @Column(name = "internetDomain")
    private String internetDomain;
    @Column(name = "contactAddress")
    private String contactAddress;
    @Column(name = "owner")
    private String owner;
    @Column(name = "logoType")
    private String logoType;

    public String getName() {
        return name;
    }

    public RentalEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getInternetDomain() {
        return internetDomain;
    }

    public RentalEntity setInternetDomain(String internetDomain) {
        this.internetDomain = internetDomain;
        return this;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public RentalEntity setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public RentalEntity setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getLogoType() {
        return logoType;
    }

    public RentalEntity setLogoType(String logoType) {
        this.logoType = logoType;
        return this;
    }
}
