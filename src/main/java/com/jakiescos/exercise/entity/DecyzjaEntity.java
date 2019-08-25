package com.jakiescos.exercise.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DecyzjaEntity {
    Long id;
    String numer;
    LocalDate dataWaznosci;
    LocalDate dataWydania;

    public DecyzjaEntity(String numer, LocalDate dataWaznosci, LocalDate dataWydania) {
        this.numer = numer;
        this.dataWaznosci = dataWaznosci;
        this.dataWydania = dataWydania;
    }

    public Long getId() {
        return id;
    }
}
