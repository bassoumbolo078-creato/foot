    package com.ism.view;

    import com.ism.Dto.CreatPersonneDto;
    import com.ism.Entity.Equipe;
import com.ism.Entity.Poste;
import com.ism.Entity.Strategie;
    import com.ism.Entity.TypePersonne;
    import com.ism.Services.EquipeService;
    import com.ism.view.MethodesMetiers;;

    public class PersonneView {
        public static Strategie selectStrategie(){
            int choix = 0;
            do {
                System.out.println("Veuillez choisir une stratégie :");
                System.out.println("1. Offensive");
                System.out.println("2. Défensive");
                choix = Integer.parseInt(System.console().readLine());
                switch (choix) {
                    case 1:
                        return Strategie.OFFENSIVE;
                    case 2:
                        return Strategie.DEFENSIVE;
                    default:
                        System.out.println("Choix invalide, veuillez réessayer.");
                }
            } while (choix < 1 || choix > 2);
            return null;
        }

        public static int lireEntier(String msg)
        {
            int entier;
            do
            {
                System.out.println(msg);
                entier = Integer.parseInt(System.console().readLine());
            } while (entier < 0);
            return entier;
        }


       public static TypePersonne selectTypePersonne() {
    int choix = 0;

    do {
        System.out.println("Veuillez choisir un type de personne :");
        System.out.println("1. Joueur");
        System.out.println("2. Entraineur");

        choix = Integer.parseInt(System.console().readLine());

        switch (choix) {
            case 1:
                return TypePersonne.JOUEUR;

            case 2:
                return TypePersonne.ENTRAINEUR;

            default:
                System.out.println("Choix invalide, veuillez réessayer.");
        }

    } while (true);
}
       public static Equipe saisieEquipe(String mat, EquipeService equipeService) {
            var equipe = equipeService.getEquipeByMatricule(mat);
            return equipe;
}
        public static Poste selectPoste() {
            int choix = 0;
            do {
                System.out.println("Veuillez choisir un poste :");
                System.out.println("1. Gardien");
                System.out.println("2. Défenseur");
                System.out.println("3. Milieu");
                System.out.println("4. Attaquant");

                choix = Integer.parseInt(System.console().readLine());

                switch (choix) {
                    case 1:
                        return Poste.GARDIEN;
                    case 2:
                        return Poste.DEFENSEUR;
                    case 3:
                        return Poste.MILIEU;
                    case 4:
                        return Poste.ATTAQUANT;
                    default:
                        System.out.println("Choix invalide, veuillez réessayer.");
                }

            } while (true);
        }
    
        public static CreatPersonneDto saisiePersonne(EquipeService equipeService) {
            var nom = MethodesMetiers.lireChaine("Nom complet");
            var date = MethodesMetiers.lireChaine("Date de naissance yyyy-MM-dd");
            var mat = MethodesMetiers.lireChaine("Matricule de l'équipe");
            var equipe = saisieEquipe(mat, equipeService);
            TypePersonne typePersonne = selectTypePersonne();
            if (typePersonne == TypePersonne.ENTRAINEUR) {

                    Strategie strategie = selectStrategie();

                    return new CreatPersonneDto(
                        nom,
                        java.time.LocalDate.parse(date),
                        equipe,
                        typePersonne,
                        strategie
                    );

                } else if (typePersonne == TypePersonne.JOUEUR) {
                    Poste poste = selectPoste();
                    var numeroMaillot = lireEntier("Numéro de maillot");

                    return new CreatPersonneDto(
                        nom,
                        java.time.LocalDate.parse(date),
                        equipe,
                        typePersonne,
                        poste,
                        numeroMaillot
                    );
                }return null;

                            
                        }
                            
                            

        
    }

