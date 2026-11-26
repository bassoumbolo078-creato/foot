package com.ism.Services;

public class MatriculeService implements IMatriculeService {
    private static int entier = 0;
    private static int entierEquipe = 0;


    @Override
    public String generateMatricule() {
       
        return "MAT00" + entier++; 
        
        
        
    }
    @Override
    public String generateMatriculeEquipe() {
       
        return "EQU00" + entierEquipe++; 
        
        
        
    }

    

}
