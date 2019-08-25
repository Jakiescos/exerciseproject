package com.jakiescos.exercise.request;

public class WyszukajDecyzjeRequest {
    Long idDecyzji;
    String numerDecyzji;
    String numerOznaczenia;
    Long podmiotId;

    public Long getIdDecyzji() {
        return idDecyzji;
    }

    public String getNumerDecyzji() {
        return numerDecyzji;
    }

    public String getNumerOznaczenia() {
        return numerOznaczenia;
    }

    public Long getPodmiotId() {
        return podmiotId;
    }
}
