package com.jakiescos.exercise;

import com.jakiescos.exercise.service.JsonConwerter;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {

        JsonConwerter jsonConwerter = new JsonConwerter();
        jsonConwerter.convertToRozliczdecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\RozliczDecyzje.json\"");
        jsonConwerter.convertToUchylDecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\UchylDecyzje.json\"");
        jsonConwerter.convertToWydajDecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\wydajDec.json\"");
        jsonConwerter.convertToWyszukajDecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\wyszukajDecById.json\"");
        jsonConwerter.convertToModyfikujDecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\wyszukajDecByNumerDecyzji.json\"");



    }
}
