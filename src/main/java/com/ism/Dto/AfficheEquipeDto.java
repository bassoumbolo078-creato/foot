package com.ism.Dto;

import java.util.ArrayList;

import com.ism.Entity.Entraineur;
import com.ism.Entity.Joueur;

public record AfficheEquipeDto(  
    String name,
    ArrayList<Joueur>  joueurs,
    Entraineur entraineur,
    String ville
  
){
}