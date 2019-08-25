package com.jakiescos.exercise.entity;

public class DanePodmiotu {

    Long id;
    Long podmiotId;
    Long nrWariantu;
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

    public Long getNrWariantu() {
        return nrWariantu;
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

    public DanePodmiotu(Long podmiotId, Long nrWariantu, String imie, String nazwisko, String pesel, String miasto, String nazwaUlicy, Integer nrDomu, Integer nrMieszkania) {
        this.podmiotId = podmiotId;
        this.nrWariantu = nrWariantu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.miasto = miasto;
        this.nazwaUlicy = nazwaUlicy;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
    }
}
