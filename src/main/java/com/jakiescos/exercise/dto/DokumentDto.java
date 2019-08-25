package com.jakiescos.exercise.dto;

public class DokumentDto {
    Long dokumentId;
    String stan;

    public DokumentDto(Long dokumentId, String stan) {
        this.dokumentId = dokumentId;
        this.stan = stan;
    }

    public Long getDokumentId() {
        return dokumentId;
    }

    public String getStan() {
        return stan;
    }
}
