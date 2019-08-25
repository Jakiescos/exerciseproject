package com.jakiescos.exercise.entity;

import lombok.Getter;
import java.time.LocalDate;
@Getter
public class DecyzjaEntity {
    private static Long nextId = 1L;
    private Long id;
    private String numer;
    private LocalDate dataWaznosci;
    private LocalDate dataWydania;
    public DecyzjaEntity(String numer, LocalDate dataWaznosci, LocalDate dataWydania) {
        this.numer = numer;
        this.dataWaznosci = dataWaznosci;
        this.dataWydania = dataWydania;
        id = nextId;
        nextId++;
    }
}