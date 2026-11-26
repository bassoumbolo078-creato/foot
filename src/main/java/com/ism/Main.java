package com.ism;

import com.ism.Entity.*;
import com.ism.Repository.memory.*;
import com.ism.Services.*;
import com.ism.view.*;

public class Main {
    public static void main(String[] args) {

        // 1. Initialisation de la base de données
        DataBaseMemory db = new DataBaseMemory();

        // 2. Création des repositories
        EquipeRepository equipeRepository = new EquipeRepository(db);
        PersonneRepository personneRepository = new PersonneRepository(db);

        // 3. Création des services
        EquipeService equipeService = new EquipeService(equipeRepository);
        PersonneService personneService = new PersonneService(personneRepository);

        // 4. Service de génération des matricules
        MatriculeService matriculeService = new MatriculeService();

        // 5. Menu principal
        int choix;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Ajouter une équipe");
            System.out.println("2. Ajouter une personne");
            System.out.println("0. Quitter");

            choix = Integer.parseInt(System.console().readLine());

            switch (choix) {
                case 1:
                    // Ajout d'une équipe
                    // À compléter avec ta méthode de saisie d'équipe
                    break;

                case 2:
                    // Saisie de la personne avec le service équipe
                    var dto = PersonneView.saisiePersonne(equipeService);
                    personneService.AddPersonne(dto, matriculeService);
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);
    }
}