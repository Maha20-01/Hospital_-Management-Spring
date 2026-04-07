package com.bridgelabz.hospital_Management.dto;

import lombok.Data;

@Data
public class PatientDto {
    private String name;
    private int age;
    private String gender;
    private String disease;
    private String address;
    private String phoneNumber;
}