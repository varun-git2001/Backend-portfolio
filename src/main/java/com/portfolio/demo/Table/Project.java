package com.portfolio.demo.Table;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Project 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    private String description;

    private String technologies;
}

