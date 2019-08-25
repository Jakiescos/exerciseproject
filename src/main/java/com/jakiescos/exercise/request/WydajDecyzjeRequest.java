package com.jakiescos.exercise.request;

import com.jakiescos.exercise.dto.DanePodmiotuDto;
import com.jakiescos.exercise.dto.TablicaDto;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class WydajDecyzjeRequest {
    String numer;
    LocalDate dataWydania;
    LocalDate dataWaznosci;
    List<TablicaDto> tablice;
    DanePodmiotuDto danePodmiotu;

    public <T> Predicate getDataWaznosci() {
        return null;
    }

    public LocalDate getDataWydania() {
        return null;
    }
}
