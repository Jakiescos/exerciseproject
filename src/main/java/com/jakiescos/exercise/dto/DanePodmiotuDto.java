package com.jakiescos.exercise.dto;

public class DanePodmiotuDto {
    String imie;
    String nazwisko;
    String pesel;
    String miasto;
    String nazwaUlicy;
    Integer nrDomu;
    Integer nrMieszkania;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public DanePodmiotuDto(String imie, String nazwisko, String pesel, String miasto, String nazwaUlicy, Integer nrDomu, Integer nrMieszkania) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.miasto = miasto;
        this.nazwaUlicy = nazwaUlicy;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
    }

    public String getPesel() {
        return pesel;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getNazwaUlicy() {
        return nazwaUlicy;
    }

    public Integer getNrDomu() {
        return nrDomu;
    }

    public Integer getNrMieszkania() {
        return nrMieszkania;
    }
}
