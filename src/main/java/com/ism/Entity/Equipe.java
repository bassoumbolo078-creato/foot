package com.ism.Entity;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
@Getter
@Setter
@ToString



public class Equipe {
    private String matricule;
    private String name;
    private ArrayList<Joueur> joueurs;
    private Entraineur entraineur;
    private String Ville;

    public Equipe(String matricule, String name, ArrayList<Joueur> joueurs, Entraineur entraineur, String ville) {
        this.matricule = matricule;
        this.name = name;
        this.joueurs = joueurs;
        this.entraineur = entraineur;
        this.Ville = ville;
    }
  


  
    
    
}
