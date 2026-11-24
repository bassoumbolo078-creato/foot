package com.ism.Services;

import java.util.ArrayList;

import com.ism.Dto.CreatEquipeDto;


public interface IEquipeService {
    boolean AddEquipe(CreatEquipeDto dto, IMatriculeService mat);
    ArrayList<CreatEquipeDto> getAllEquipes();
    
}
