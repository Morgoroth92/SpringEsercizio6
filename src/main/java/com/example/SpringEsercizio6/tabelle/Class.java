package com.example.SpringEsercizio6.tabelle;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "classes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_class;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

}
