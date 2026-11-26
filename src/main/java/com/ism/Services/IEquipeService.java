package com.ism.Services;

import java.util.ArrayList;

import com.ism.Dto.CreatEquipeDto;
import com.ism.Entity.Equipe;


public interface IEquipeService {
    boolean AddEquipe(CreatEquipeDto dto, IMatriculeService mat);
    ArrayList<CreatEquipeDto> getAllEquipes();
    Equipe getEquipeByMatricule(String matricule);
    
}
