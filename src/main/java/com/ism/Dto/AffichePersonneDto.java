package com.ism.Dto;

import java.time.LocalDate;

import com.ism.Entity.Equipe;
import com.ism.Entity.Poste;
import com.ism.Entity.Strategie;
import com.ism.Entity.TypePersonne;

public record AffichePersonneDto(
        String nameComplete,
        LocalDate DateNaissance,
        Equipe equipe,
        TypePersonne typePersonne,
        Poste poste,
        int numeroMaillot,
        Strategie strategie){


    
}
