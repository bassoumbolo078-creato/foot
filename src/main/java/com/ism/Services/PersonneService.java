package com.ism.Services;

import java.util.ArrayList;

import com.ism.Dto.AffichePersonneDto;
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
    public ArrayList<AffichePersonneDto> getAllPersonnes(AffichePersonneDto personneDto ) {
            ArrayList<AbstractEntity> personnes=repo.findAll();
            ArrayList<AffichePersonneDto> personnesdto=new ArrayList<>();
            for (AbstractEntity personne: personnes ) {
                var name= personne.getNameComplete();
                var dateNaissance=personne.getDateNaissance();
                var equipe=personne.getEquipe();
                var type = personne.getTypePersonne();
                if (type==TypePersonne.ENTRAINEUR) {
                    Entraineur entraineur=(Entraineur) personne;
                    var strategie=entraineur.getStrategie();
                    
                }else if (type==TypePersonne.JOUEUR) {
                    Joueur joueur=(Joueur) personne;
                    var poste=joueur.getPoste();
                    var numeroMaillot=joueur.getNumeroMaillot();
                }                
            }
            return personnesdto;
            
        
    }



   
    
}
