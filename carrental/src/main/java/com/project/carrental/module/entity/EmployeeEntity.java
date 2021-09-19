package com.project.carrental.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "position")
    private String position;
    @Column(name = "department")
    private String department;


    public String getName() {
        return name;
    }

    public EmployeeEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeeEntity setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public EmployeeEntity setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public EmployeeEntity setDepartment(String department) {
        this.department = department;
        return this;
    }
}
