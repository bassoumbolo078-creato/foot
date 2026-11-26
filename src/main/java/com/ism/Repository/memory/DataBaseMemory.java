package com.ism.Repository.memory;

import java.util.ArrayList;

import com.ism.Entity.AbstractEntity;
import com.ism.Entity.Equipe;

public class DataBaseMemory {
    ArrayList<AbstractEntity> personnes = new ArrayList<>();
    ArrayList<Equipe> equipes = new ArrayList<>();
    private  DataBaseMemory() {
    }
    private static DataBaseMemory instance = null;
    public static DataBaseMemory getInstance() {
        if (instance == null) {
            instance = new DataBaseMemory();
        }
        return instance;
    }

}
