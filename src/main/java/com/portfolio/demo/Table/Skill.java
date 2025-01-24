package com.portfolio.demo.Table;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Skill 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

}

