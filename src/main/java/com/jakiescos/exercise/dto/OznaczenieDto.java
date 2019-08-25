package com.jakiescos.exercise.dto;

public class OznaczenieDto {
    Long oznaczenieId;
    String stan;

    public OznaczenieDto(Long oznaczenieId, String stan) {
        this.oznaczenieId = oznaczenieId;
        this.stan = stan;
    }

    public Long getOznaczenieId() {
        return oznaczenieId;
    }

    public String getStan() {
        return stan;
    }
}
