package com.example.parcial2.domain.entities;

import com.example.parcial2.common.Type;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Entity
@Table(name = "Article")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, name = "articleName")
    private String name;

    @Column(nullable = false, name = "articleType")
    private Type type;

    @Column(name = "articlePrice")

    private Double price;

    @Column(nullable = false, name = "articleProvider")
    private Provider magicProvider;
}
