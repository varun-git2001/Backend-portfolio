package com.portfolio.demo.Table;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contact 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String phone;

    @Column(nullable = false, length = 100)
    private String email;

}
