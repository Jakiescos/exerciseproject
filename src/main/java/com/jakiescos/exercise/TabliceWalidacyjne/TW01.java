package com.jakiescos.exercise.TabliceWalidacyjne;

import com.jakiescos.exercise.request.WydajDecyzjeRequest;

import java.time.LocalDate;
import java.util.function.Predicate;
public class TW01 implements Predicate<WydajDecyzjeRequest> {
    @Override
    public boolean test(WydajDecyzjeRequest wydajDecyzjeRequest) {
        LocalDate dataWaznosci = wydajDecyzjeRequest.getDataWaznosci();
        return dataWaznosci.isEqual(wydajDecyzjeRequest.getDataWydania().plusYears(1));
    }
}