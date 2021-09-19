package com.project.carrental.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;

    public String getName() {
        return name;
    }

    public ClientEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public ClientEntity setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ClientEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ClientEntity setAddress(String address) {
        this.address = address;
        return this;
    }
}
