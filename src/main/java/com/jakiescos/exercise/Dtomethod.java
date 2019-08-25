package com.jakiescos.exercise;

import com.jakiescos.exercise.dto.BlankietDto;
import com.jakiescos.exercise.dto.DanePodmiotuDto;
import com.jakiescos.exercise.dto.TablicaDto;
import com.jakiescos.exercise.entity.*;
import com.jakiescos.exercise.enumy.RodzajOznaczenia;
import com.jakiescos.exercise.enumy.Stan;
import com.jakiescos.exercise.enumy.TypDokumentu;
import com.jakiescos.exercise.request.WydajDecyzjeRequest;

import java.util.List;


public class Dtomethod {
    Long wydajDecyzje(WydajDecyzjeRequest dto) {
        DecyzjaEntity decyzja = new DecyzjaEntity(dto.getNumer(), dto.getDataWaznosci(), dto.getDataWydania());

        List<TablicaDto> tablice = dto.getTablice();
        for (TablicaDto tablicaDto : tablice) {
            OznaczenieEntity tablica =
                    new OznaczenieEntity(decyzja.getId(), tablicaDto.getNumer(), RodzajOznaczenia.TABLICA_POJAZDU,
                            null, Stan.ODEBRANY);

            OznaczenieEntity znakLegalizacyjy =
                    new OznaczenieEntity(decyzja.getId(), tablicaDto.getNumer(),
                            RodzajOznaczenia.ZNAK_LEGALIZACYJNY, tablica.getId(), Stan.ODEBRANY);

            List<BlankietDto> blankietyDto = tablicaDto.getBlankiety();
            for (BlankietDto blankietDto : blankietyDto) {
                BlankietEntity blankiet =
                        new BlankietEntity(decyzja.getId(),blankietDto.getNumer(), getTyp(blankietDto.getTyp()));
               // PodmiotEntity podmiot = new PodmiotEntity(decyzja.getId(),);
              //  DanePodmiotu danePodmiotu = new DanePodmiotu()
            }
        }

    }


    private TypDokumentu getTyp(String typ) {
        if (typ.equals("DR")) {
            return TypDokumentu.DR;
        }
        return TypDokumentu.PC;
    }
}
