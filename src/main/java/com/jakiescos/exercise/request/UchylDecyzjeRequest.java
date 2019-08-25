package com.jakiescos.exercise.request;

import java.time.LocalDate;

public class UchylDecyzjeRequest {
    Long decyzjaId;
    LocalDate dataUchylenia;

    public Long getDecyzjaId() {
        return decyzjaId;
    }

    public LocalDate getDataUchylenia() {
        return dataUchylenia;
    }
}
