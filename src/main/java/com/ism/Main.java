package com.ism;

import com.ism.Entity.*;
import com.ism.Factory.RepositoryFactory;
import com.ism.Repository.memory.*;
import com.ism.Services.*;
import com.ism.view.*;

public class Main {
    public static void main(String[] args) {

        EquipeRepository equipeRepository = RepositoryFactory.CreatRepoEquipe();
        PersonneRepository personneRepository = RepositoryFactory.CreatRepoPersonne();

        EquipeService equipeService = new EquipeService(equipeRepository);
        PersonneService personneService = new PersonneService(personneRepository);

        // 4. Service de génération des matricules
        MatriculeService matriculeService = new MatriculeService();
       
             var choix = Menu.menu();
            switch (choix) {
                case 1:
                    var equipeDto = EquipeView.saisieEquipe();
                    equipeService.AddEquipe(equipeDto,matriculeService);
                    break;

                case 2:
                    // Saisie de la personne avec le service équipe
                    var dto = PersonneView.saisiePersonne(equipeService);
                    personneService.AddPersonne(dto, matriculeService);
                    break;


                case 3:
                     var equipes=EquipeView.lister(equipeService);
                   
                   break;

                default:
                    System.out.println("Choix invalide !");
            }

    }
}
