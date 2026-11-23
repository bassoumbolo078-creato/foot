package com.ism.Dto;

import java.time.LocalDate;

import com.ism.Entity.Equipe;
import com.ism.Entity.Poste;
import com.ism.Entity.Strategie;
import com.ism.Entity.TypePersonne;

import lombok.Getter;



@Getter 


public class CreatPersonneDto {

    private final String nameComplete;
    private final LocalDate DateNaissance;
    private final Equipe equipe;
    private final  TypePersonne typePersonne;
    private final  Poste poste;
    private final  int numeroMaillot;
    private final  Strategie strategie;
    public CreatPersonneDto(String nameComplete, LocalDate dateNaissance, Equipe equipe, TypePersonne typePersonne,
            Poste poste, int numeroMaillot) {
        this.nameComplete = nameComplete;
        DateNaissance = dateNaissance;
        this.equipe = equipe;
        this.typePersonne = typePersonne;
        this.poste = poste;
        this.numeroMaillot = numeroMaillot;
        this.strategie = null;
    }
     public CreatPersonneDto(String nameComplete, LocalDate dateNaissance, Equipe equipe, TypePersonne typePersonne,Strategie strategie
            ) {
        this.nameComplete = nameComplete;
        DateNaissance = dateNaissance;
        this.equipe = equipe;
        this.typePersonne = typePersonne;
        this.poste = null;
        this.numeroMaillot = 0;
        this.strategie = strategie;
    }
    
  
    
}
