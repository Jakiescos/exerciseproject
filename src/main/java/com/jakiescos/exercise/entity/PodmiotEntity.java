package com.jakiescos.exercise.entity;

public class PodmiotEntity {
    Long id;
    Long decyzjaId;
    Long nrWariantu;

    public PodmiotEntity(Long decyzjaId, Long nrWariantu) {
        this.id = id;
        this.decyzjaId = decyzjaId;
        this.nrWariantu = nrWariantu;
    }

    public Long getDecyzjaId() {
        return decyzjaId;
    }

    public Long getNrWariantu() {
        return nrWariantu;
    }
}
