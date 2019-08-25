package com.jakiescos.exercise.dto;

public class DokumentOznaczenieDto {
    OznaczenieDto oznaczenie;
    DokumentDto dokument;

    public DokumentOznaczenieDto(OznaczenieDto oznaczenie, DokumentDto dokument) {
        this.oznaczenie = oznaczenie;
        this.dokument = dokument;
    }

    public OznaczenieDto getOznaczenie() {
        return oznaczenie;
    }

    public DokumentDto getDokument() {
        return dokument;
    }
}
