package com.jakiescos.exercise.entity;

import com.jakiescos.exercise.enumy.TypDokumentu;

public class BlankietEntity {
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
