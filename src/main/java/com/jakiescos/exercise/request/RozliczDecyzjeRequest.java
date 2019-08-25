package com.jakiescos.exercise.request;

import com.jakiescos.exercise.dto.DokumentOznaczenieDto;

import java.util.List;

public class RozliczDecyzjeRequest {
    List<DokumentOznaczenieDto> dokumentOznaczenie;

    public List<DokumentOznaczenieDto> getDokumentOznaczenie() {
        return dokumentOznaczenie;
    }
}
