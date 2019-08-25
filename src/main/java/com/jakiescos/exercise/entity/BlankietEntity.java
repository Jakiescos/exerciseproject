package com.jakiescos.exercise.entity;

import com.jakiescos.exercise.enumy.TypDokumentu;

public class BlankietEntity {
    public Long getId() {
        return id;
    }

    public Long getDecyzjaId() {
        return decyzjaId;
    }

    public String getNumer() {
        return numer;
    }

    public TypDokumentu getTyp() {
        return typ;
    }

    Long id;
    Long decyzjaId;
    String numer;
    TypDokumentu typ;

    public BlankietEntity(Long decyzjaId, String numer, TypDokumentu typ) {
        this.decyzjaId = decyzjaId;
        this.numer = numer;
        this.typ = typ;
    }
}
