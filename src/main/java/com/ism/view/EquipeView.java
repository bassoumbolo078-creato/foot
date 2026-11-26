package com.ism.view;

import java.util.ArrayList;

import com.ism.Dto.AfficheEquipeDto;
import com.ism.Dto.CreatEquipeDto;
import com.ism.Services.EquipeService;
import com.ism.view.MethodesMetiers;

public class EquipeView {
    public static CreatEquipeDto saisieEquipe(){
       var name=MethodesMetiers.lireChaine("Nom Equipe");
       var ville=MethodesMetiers.lireChaine("Ville Equipe");
       return new CreatEquipeDto(null,name,null,null,ville);    
       
    }
    public static  ArrayList<AfficheEquipeDto> lister(EquipeService equipeService) {
    var equipes = equipeService.getAllEquipes();
    ArrayList<AfficheEquipeDto> equipesdto = new ArrayList<>();

    for (CreatEquipeDto e : equipes) {
        AfficheEquipeDto dto = new AfficheEquipeDto(
            e.getName(),
            e.getJoueurs(),
            e.getEntraineur(),
            e.getVille()
        );

        equipesdto.add(dto);
    }

    return equipesdto;
}

    }

    

