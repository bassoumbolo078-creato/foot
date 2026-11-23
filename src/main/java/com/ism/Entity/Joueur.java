package com.ism.Entity;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import lombok.EqualsAndHashCode;
@Getter 
@Setter
@ToString   





public class Joueur extends AbstractEntity {
    
    private int numeroMaillot;
    private Poste poste;
    
    
public Joueur(String matricule, String nameComplete, LocalDate dateNaissance,
                Equipe equipe, Poste poste, int numeroMaillot) {
        super(matricule, nameComplete, dateNaissance, equipe,TypePersonne.JOUEUR);
        this.numeroMaillot = numeroMaillot;
        this.poste=poste;

       
}

   



    
}
