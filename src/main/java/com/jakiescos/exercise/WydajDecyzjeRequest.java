package com.jakiescos.exercise;

import java.time.LocalDate;
import java.util.List;

public class WydajDecyzjeRequest {
    String numer;
    LocalDate dataWydania;
    LocalDate dataWaznosci;
    List<TablicaDto> tablice;
    DanePodmiotuDto danePodmiotu;
}
