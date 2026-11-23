package com.ism.Services;

import java.util.ArrayList;

import com.ism.Dto.CreatPersonneDto;
import com.ism.Entity.AbstractEntity;
import com.ism.Entity.TypePersonne;


public interface IPersonne {
boolean AddPersonne( CreatPersonneDto dto, IMatriculeService mat);
ArrayList<AbstractEntity> getAllPersonnes();

    
    
}
