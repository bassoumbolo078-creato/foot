package com.ism.Services;

import java.util.ArrayList;
import com.ism.Dto.CreatEquipeDto;
import com.ism.Entity.Entraineur;
import com.ism.Entity.Equipe;
import com.ism.Repository.memory.EquipeRepository;

public class EquipeService  implements IEquipeService{
    private final EquipeRepository repo;

    public EquipeService(EquipeRepository repo) {
        this.repo = repo;
    }

    @Override
    public boolean AddEquipe(CreatEquipeDto dto, IMatriculeService mat) {
        String matricule = mat.generateMatriculeEquipe();
        Equipe newEquipe = new Equipe(
                matricule,
                dto.getName(),
                dto.getJoueurs(),
                dto.getEntraineur(),
                dto.getVille()
        );


        this.repo.save(newEquipe);
        
        return true;
    }

    @Override
    public ArrayList<CreatEquipeDto> getAllEquipes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEquipes'");
    }

    
}
