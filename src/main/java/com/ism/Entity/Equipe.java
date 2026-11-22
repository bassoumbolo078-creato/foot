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
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Equipe {
    private String name;
    private ArrayList<Joueur> joueurs;
    private Entraineur entraineur;
    private String Ville;



  
    
    
}
