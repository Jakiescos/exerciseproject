package com.jakiescos.exercise;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jakiescos.exercise.dto.StringiDto;
import com.jakiescos.exercise.request.*;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

public class JsonConwerter {

    public RozliczDecyzjeRequest convertToRozliczdecyzje(String pathToFile) throws IOException {
        String jsonContent1 = StringiDto.jsonToString(pathToFile);
        System.out.println(jsonContent1);
        ObjectMapper mapper1 = new ObjectMapper();
        return mapper1.readValue(jsonContent1, RozliczDecyzjeRequest.class);
    }


    public UchylDecyzjeRequest convertToUchylDecyzje(String pathToFile) throws IOException {
        String jsonContent2 = StringiDto.jsonToString(pathToFile);
        System.out.println(jsonContent2);
        ObjectMapper mapper2 = new ObjectMapper();
        return mapper2.readValue(jsonContent2, UchylDecyzjeRequest.class);
    }

    public WydajDecyzjeRequest convertToWydajDecyzje (String pathToFile) throws IOException {
        String jsonContent3 = StringiDto.jsonToString(pathToFile);
        System.out.println(jsonContent3);
        ObjectMapper mapper3 = new ObjectMapper();
        return mapper3.readValue(jsonContent3, WydajDecyzjeRequest.class);
    }

    public WyszukajDecyzjeRequest convertToWyszukajDecyzje (String pathToFile) throws IOException {
        String jsonContent4 = StringiDto.jsonToString(pathToFile);
        System.out.println(jsonContent4);
        ObjectMapper mapper4 = new ObjectMapper();
        return mapper4.readValue(jsonContent4, WyszukajDecyzjeRequest.class);
    }

    public ModyfikujPodmiotRequest convertToModyfikujDecyzje (String pathToFile) throws IOException {
        String jsonContent5 = StringiDto.jsonToString(pathToFile);
        System.out.println(jsonContent5);
        ObjectMapper mapper5 = new ObjectMapper();
        return mapper5.readValue(jsonContent5, ModyfikujPodmiotRequest.class);
    }

}
