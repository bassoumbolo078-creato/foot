package com.ism.view;

public class Menu {
      public static int menu(){
        System.out.println("1. Ajouter une Joueur ou un Entraineur");
        System.out.println("2. lister les joueurs ou les entraineurs");
        System.out.println("3. Ajouter un joueur ou un entraineur à une équipe");
        System.out.println("4. Lister les joueurs ou les entraineurs d'une équipe");
        System.out.println("5. Quitter");
        String option = System.console().readLine("Veuillez choisir une option : ");
        return Integer.parseInt(option);
    }
}
