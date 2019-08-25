package com.jakiescos.exercise.TabliceWalidacyjne;

import com.jakiescos.exercise.request.WydajDecyzjeRequest;

import java.util.function.Predicate;
public class TW0101 implements Predicate<WydajDecyzjeRequest> {
    @Override
    public boolean test(WydajDecyzjeRequest wydajDecyzjeRequest) {
        return wydajDecyzjeRequest.getDataWaznosci().isEqual(wydajDecyzjeRequest.getDataWydania().plusYears(1));
    }