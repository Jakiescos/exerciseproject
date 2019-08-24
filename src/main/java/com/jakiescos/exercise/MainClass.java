package com.jakiescos.exercise;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jakiescos.exercise.dto.StringiDto;
import com.jakiescos.exercise.request.*;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {

        com.jakiescos.exercise.JsonConwerter jsonConwerter = new com.jakiescos.exercise.JsonConwerter();
        jsonConwerter.convertToRozliczdecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\RozliczDecyzje.json\"");
        jsonConwerter.convertToUchylDecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\UchylDecyzje.json\"");
        jsonConwerter.convertToWydajDecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\wydajDec.json\"");
        jsonConwerter.convertToWyszukajDecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\wyszukajDecById.json\"");
        jsonConwerter.convertToModyfikujDecyzje("\"D:\\JAVA\\zjazdy\\sierpien\\24.08\\wyszukajDecByNumerDecyzji.json\"");

    }
}
