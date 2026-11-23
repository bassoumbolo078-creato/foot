package com.ism.Services;

import java.util.ArrayList;

import com.ism.Entity.Equipe;

public interface IEquipeService {
    boolean AddEquipe(Equipe equipe);
    ArrayList<Equipe> getAllEquipes();
    
}
