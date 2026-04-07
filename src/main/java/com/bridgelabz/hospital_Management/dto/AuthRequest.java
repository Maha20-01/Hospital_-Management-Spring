package com.bridgelabz.hospital_Management.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String name;
    private String email;
    private String password;
}