package com.jakiescos.exercise;

import com.jakiescos.exercise.entity.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Database {
    private static Database database;
    private List<BlankietEntity> blankietEntities = new ArrayList<>();
    private List<DanePodmiotu> danePodmiotow = new ArrayList<>();
    private List<DecyzjaEntity> decyzjaEntities = new ArrayList<>();
    private List<OznaczenieEntity> oznaczenieEntities = new ArrayList<>();
    private List<PodmiotEntity> podmiotEntities = new ArrayList<>();
    private List<UchylenieDecyzjiEntity> uchylenieDecyzjiEntities = new ArrayList<>();
    private Database() {
    }
    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }
    public void addBlankietEntity(BlankietEntity blankietEntity) {
        blankietEntities.add(blankietEntity);
    }
    public void addDanePodmiotu(DanePodmiotu danePodmiotu) {
        danePodmiotow.add(danePodmiotu);
    }
    public void addDecyzjaEntity(DecyzjaEntity decyzjaEntity) {
        decyzjaEntities.add(decyzjaEntity);
    }
    public void addOznaczenieEntity(OznaczenieEntity oznaczenieEntity) {
        oznaczenieEntities.add(oznaczenieEntity);
    }
    public void addPodmiotEntity(PodmiotEntity podmiotEntity) {
        podmiotEntities.add(podmiotEntity);
    }
    public void addUchylenieDecyzjiEntity(UchylenieDecyzjiEntity uchylenieDecyzjiEntity) {
        uchylenieDecyzjiEntities.add(uchylenieDecyzjiEntity);
    }
}
