package com.bridgelabz.hospital_Management.entity;

import jakarta.persistence.*;
import lombok.Data;
import com.bridgelabz.hospital_Management.entity.Role;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}

