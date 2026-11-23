package com.ism.Services;

public class MatriculeService implements IMatriculeService {
    private static int entier = 0;


    @Override
    public String generateMatricule() {
       
        return "MAT00" + entier++; 
        
        
        
    }

    

}
