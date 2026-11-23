package com.ism.Services;

import java.util.ArrayList;

import com.ism.Dto.CreatPersonneDto;
import com.ism.Entity.AbstractEntity;
import com.ism.Entity.Entraineur;
import com.ism.Entity.Joueur;
import com.ism.Entity.TypePersonne;
import com.ism.Repository.memory.PersonneRepository;


public class PersonneService implements IPersonne {
    private  final PersonneRepository repo;  
    private PersonneService(PersonneRepository personneRepository) {
        this.repo = personneRepository;
    }
    @Override
    public boolean AddPersonne(CreatPersonneDto dto , IMatriculeService mat ) {
        String matricule = mat.generateMatricule();
       if (dto.getTypePersonne()==TypePersonne.JOUEUR) {
        Joueur newjJoueur = new Joueur(
                matricule,
                dto.getNameComplete(),
                dto.getDateNaissance(),
                dto.getEquipe(),
                dto.getPoste(),
                dto.getNumeroMaillot()
        );

           this.repo.save(newjJoueur); 
       }else{
             Entraineur newEntraineur = new Entraineur(matricule, dto.getNameComplete(), dto.getDateNaissance() , dto.getEquipe(), dto.getStrategie());
             this.repo.save(newEntraineur);

       }
       return true;

        
    }
    @Override
    public ArrayList<AbstractEntity> getAllPersonnes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPersonnes'");
    }



   
    
}
