package com.ism.Repository.memory;

import java.util.ArrayList;

import com.ism.Entity.Equipe;
import com.ism.Repository.IEquipeRepository;

public class EquipeRepository implements IEquipeRepository {
    private DataBaseMemory db ;
    public  EquipeRepository(DataBaseMemory db) {
        this.db = db;
    }

    @Override
    public void save(Equipe equipe) {
       this.db.equipes.add(equipe);
        
    }

    @Override
    public ArrayList<Equipe> findAll() {
        return new ArrayList<>(this.db.equipes);
    }
    
}
