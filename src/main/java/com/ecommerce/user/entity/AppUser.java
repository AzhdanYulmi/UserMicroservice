package com.ecommerce.user.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
}
