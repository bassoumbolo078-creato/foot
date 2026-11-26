package com.ism.view;

import com.ism.Dto.CreatEquipeDto;
import com.ism.view.MethodesMetiers;

public class EquipeView {
    public static CreatEquipeDto saisEquipeDto(){
       var name=MethodesMetiers.lireChaine("Nom Equipe");
       var ville=MethodesMetiers.lireChaine("Ville Equipe");
       return new CreatEquipeDto(null,name,null,null,ville);    
       
    }

    
}
