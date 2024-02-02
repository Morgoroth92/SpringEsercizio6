package com.example.SpringEsercizio6.tabelle;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_enrollment;

    @ManyToOne
    private Students students;


    @ManyToOne
    private Class aClass;



}
