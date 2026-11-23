package com.ism.Entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
 


public class Entraineur extends AbstractEntity {
    private Strategie strategie;

    public Entraineur(String matricule, String nameComplete, LocalDate DateNaissance, Equipe equipe,
           Strategie strategie) {
        super(matricule, nameComplete, DateNaissance, equipe, TypePersonne.ENTRAINEUR);
        this.strategie = strategie;
    }
    
  

    
}
