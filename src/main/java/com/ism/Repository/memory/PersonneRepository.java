package com.ism.Repository.memory;

import java.util.ArrayList;

import com.ism.Entity.AbstractEntity;
import com.ism.Repository.IPersonneRepository;

public class PersonneRepository implements IPersonneRepository{
    private DataBaseMemory db ;
    public PersonneRepository(DataBaseMemory db) {
        this.db = db;
    }

    @Override
    public void save(AbstractEntity personne) {
        this.db.personnes.add(personne);

    }


    @Override
    public ArrayList<AbstractEntity> findAll() {
        return new ArrayList<>(this.db.personnes);
    }

} 
    
    

