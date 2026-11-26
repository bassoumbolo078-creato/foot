package com.ism.Factory;

import com.ism.Repository.memory.EquipeRepository;
import com.ism.Repository.memory.PersonneRepository;
import com.ism.Services.EquipeService;
import com.ism.Services.PersonneService;

public class ServiceFactory {
    public static EquipeService CreatEquipeService( EquipeRepository equipeRepository){
        EquipeService equipeService = new EquipeService(equipeRepository);
        return equipeService;
    }
    public static PersonneService CreatEquipeService(PersonneRepository personneRepository){
        PersonneService personneService = new PersonneService(personneRepository);
        return personneService;
    }
    
}
