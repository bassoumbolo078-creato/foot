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
        ArrayList<Equipe> equipes = repo.findAll();
        ArrayList<CreatEquipeDto> equipesDto = new ArrayList<>();
        for (Equipe equipe : equipes) {
            var name = equipe.getName();
            var joueurs = equipe.getJoueurs();
            var entraineur = equipe.getEntraineur();
            var ville = equipe.getVille();

            CreatEquipeDto equipeDto = new CreatEquipeDto(
                    null,
                    name,
                    joueurs,
                    entraineur,
                    ville
            );
            equipesDto.add(equipeDto);
        }
        return equipesDto;
    }
    @Override 
    public Equipe getEquipeByMatricule(String matricule) {
        return this.repo.findByMatricule(matricule);
    }
    
    

    
}
