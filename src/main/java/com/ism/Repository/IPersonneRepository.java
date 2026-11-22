package com.ism.Repository;

import java.util.ArrayList;

import com.ism.Entity.AbstractEntity;

public interface IPersonneRepository {
     void save(AbstractEntity personne);
     ArrayList<AbstractEntity> findAll();
     
    

    
}
