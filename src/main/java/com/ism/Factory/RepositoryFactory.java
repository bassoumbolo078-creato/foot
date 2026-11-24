package com.ism.Factory;

import com.ism.Repository.memory.DataBaseMemory;
import com.ism.Repository.memory.EquipeRepository;
import com.ism.Repository.memory.PersonneRepository;

public class RepositoryFactory {
    public static PersonneRepository CreatRepoPersonne(){

        return new PersonneRepository(DataBaseMemory.getInstance());

    }
    public static EquipeRepository  CreatRepoEquipe(){
        return new EquipeRepository (DataBaseMemory.getInstance());
    }
    
}
