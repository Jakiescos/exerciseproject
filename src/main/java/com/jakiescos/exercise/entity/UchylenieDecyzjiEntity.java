package com.jakiescos.exercise.entity;

import java.time.LocalDate;

public class UchylenieDecyzjiEntity {
    Long id;
    Long decyzjaId;
    LocalDate dataUchylenia;

    public UchylenieDecyzjiEntity(Long id, Long decyzjaId, LocalDate dataUchylenia) {
        this.id = id;
        this.decyzjaId = decyzjaId;
        this.dataUchylenia = dataUchylenia;
    }

    public Long getDecyzjaId() {
        return decyzjaId;
    }

    public LocalDate getDataUchylenia() {
        return dataUchylenia;
    }
}
