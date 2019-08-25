package com.jakiescos.exercise.request;

import com.jakiescos.exercise.dto.DanePodmiotuDto;
import com.jakiescos.exercise.dto.TablicaDto;

import java.time.LocalDate;
import java.util.List;

public class WydajDecyzjeRequest {
    String numer;
    LocalDate dataWydania;
    LocalDate dataWaznosci;
    List<TablicaDto> tablice;
    DanePodmiotuDto danePodmiotu;

    public String getNumer() {
        return numer;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public List<TablicaDto> getTablice() {
        return tablice;
    }

    public DanePodmiotuDto getDanePodmiotu() {
        return danePodmiotu;
    }

    public WydajDecyzjeRequest(String numer, LocalDate dataWydania, LocalDate dataWaznosci, List<TablicaDto> tablice, DanePodmiotuDto danePodmiotu) {
        this.numer = numer;
        this.dataWydania = dataWydania;
        this.dataWaznosci = dataWaznosci;
        this.tablice = tablice;
        this.danePodmiotu = danePodmiotu;
    }
}
