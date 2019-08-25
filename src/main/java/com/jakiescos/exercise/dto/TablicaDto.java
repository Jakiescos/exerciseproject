package com.jakiescos.exercise.dto;

import java.util.List;

public class TablicaDto {
    String numer;
    ZnakLegalizacyjnyDto zl;
    List<BlankietDto> blankiety;

    public TablicaDto(String numer, ZnakLegalizacyjnyDto zl, List<BlankietDto> blankiety) {
        this.numer = numer;
        this.zl = zl;
        this.blankiety = blankiety;
    }

    public String getNumer() {
        return numer;
    }

    public ZnakLegalizacyjnyDto getZl() {
        return zl;
    }

    public List<BlankietDto> getBlankiety() {
        return blankiety;
    }
}
