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
}
