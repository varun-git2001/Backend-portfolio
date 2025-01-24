package com.portfolio.demo.Table;

import jakarta.persistence.*;
import lombok.Data;
//import java.util.List;

@Entity
@Data
@Table(name = "users") // Explicitly specify table name to avoid conflicts
public class User 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name; 

    @Column(nullable = false, unique = true, length = 100)
    private String email; 

    @Column(nullable = false, unique = true, length = 20)
    private String phoneNumber; 

    @Column(nullable = false, unique = true, length = 100)
    private String linkedinUrl; 

    // @Lob
    // private byte[] profile; 
    @Column(length = 500)
    private String bio;

}
