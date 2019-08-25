package com.jakiescos.exercise.entity;

import com.jakiescos.exercise.enumy.RodzajOznaczenia;
import com.jakiescos.exercise.enumy.Stan;

public class OznaczenieEntity {
    Long id;
    Long decyzjaId;
    String numer;
    RodzajOznaczenia rodzajOznaczenia;
    Long zl2TpId;
    Stan stan;

    public OznaczenieEntity(Long decyzjaId, String numer, RodzajOznaczenia rodzajOznaczenia, Long zl2TpId, Stan stan) {
        this.decyzjaId = decyzjaId;
        this.numer = numer;
        this.rodzajOznaczenia = rodzajOznaczenia;
        this.zl2TpId = zl2TpId;
        this.stan = stan;
    }

    public Long getId() {
        return id;
    }

    public Long getDecyzjaId() {
        return decyzjaId;
    }

    public String getNumer() {
        return numer;
    }

    public RodzajOznaczenia getRodzajOznaczenia() {
        return rodzajOznaczenia;
    }

    public Long getZl2TpId() {
        return zl2TpId;
    }

    public Stan getStan() {
        return stan;
    }
}
