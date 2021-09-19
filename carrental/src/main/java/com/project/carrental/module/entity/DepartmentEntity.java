package com.project.carrental.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address")
    private String address;
}
