package com.ism.Repository;

import java.util.ArrayList;

import com.ism.Entity.Equipe;

public interface IEquipeRepository {
    void save(Equipe equipe);
    ArrayList<Equipe> findAll();
    
    
}
