package com.jakiescos.exercise.request;

public class ModyfikujPodmiotRequest {
    Long podmiotId;
    String imie;
    String nazwisko;
    String pesel;
    String miasto;
    String nazwaUlicy;
    Integer nrDomu;
    Integer nrMieszkania;

    public Long getPodmiotId() {
        return podmiotId;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
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
