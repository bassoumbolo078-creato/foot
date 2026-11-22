package com.ism.Entity;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
@Getter 
@Setter
@ToString   
@EqualsAndHashCode(onlyExplicitlyIncluded = true)   




public class Joueur extends AbstractEntity {
    private String position;
    private LocalDate dateNaissance;
    private int numeroMaillot;
   



    
}
