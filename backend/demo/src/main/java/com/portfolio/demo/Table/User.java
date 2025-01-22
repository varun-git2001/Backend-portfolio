package com.portfolio.demo.Table;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "users") // Explicitly specify table name to avoid conflicts
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name; // User's full name

    @Column(nullable = false, unique = true, length = 100)
    private String email; // Portfolio email address

    @Column(nullable = false, unique = true, length = 20)
    private String phoneNumber; // Portfolio contact number

    @Column(nullable = false, unique = true, length = 100)
    private String linkedinUrl; // LinkedIn URL for professional network

    @Lob
    private byte[] profile; // Profile picture for the portfolio

    @Column(length = 500)
    private String bio; // A short bio or introduction for the user

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects; // List of projects related to the user

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Skill> skills; // List of skills

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Education> educationList; // Educational qualifications

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contact> contacts; // Contact form submissions

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Gallery> galleries; // Portfolio gallery
}
