package com.jakiescos.exercise.dto;

public class BlankietDto {
    String numer;
    String typ;

    public BlankietDto(String numer, String typ) {
        this.numer = numer;
        this.typ = typ;
    }

    public String getNumer() {
        return numer;
    }

    public String getTyp() {
        return typ;
    }
}
