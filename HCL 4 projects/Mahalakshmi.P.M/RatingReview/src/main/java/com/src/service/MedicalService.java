package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.Medical;

public interface MedicalService {

	public List < Medical > getMedicals();

    public void saveMedical(Medical theMedical);
    
	public Optional<Medical> getMedical(int theId);

    public void deleteMedical(Medical theMedical);


	
}
