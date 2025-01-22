package com.portfolio.demo.Table;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 100)
    private String degree;

    @Column(nullable = false, length = 100)
    private String institution;

}
