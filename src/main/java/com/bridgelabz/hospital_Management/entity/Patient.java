package com.bridgelabz.hospital_Management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String disease;
    private String address;
    private String phoneNumber;
}
