package com.ism.Dto;

import java.util.ArrayList;

import com.ism.Entity.Entraineur;
import com.ism.Entity.Joueur;

import lombok.Getter;


@Getter 

public class CreatEquipeDto {
    private String matricule;
    private String name;
    private ArrayList<Joueur> joueurs=new ArrayList<>() ;
    private Entraineur entraineur;
    private String Ville;

    public CreatEquipeDto(String matricule, String name, ArrayList<Joueur> joueurs, Entraineur entraineur, String ville) {
        this.name = name;
        this.joueurs = null;
        this.entraineur = null;
        this.Ville = ville;
    }

    // Getters and setters
}

