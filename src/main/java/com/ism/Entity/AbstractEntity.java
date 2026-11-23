package com.ism.Entity;


import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 

public class AbstractEntity {
    protected String matricule;
    protected String nameComplete;
    protected LocalDate DateNaissance;
    protected Equipe equipe;
    protected TypePersonne typePersonne;
    
}
