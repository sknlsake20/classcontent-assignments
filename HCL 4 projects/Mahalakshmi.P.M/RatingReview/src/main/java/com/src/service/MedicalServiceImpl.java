package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.MedicalDAO;
import com.src.entity.Medical;

@Service
public class MedicalServiceImpl implements MedicalService {

	@Autowired
    private MedicalDAO medicalDAO;
	
	@Override
    @Transactional
	public List<Medical> getMedicals() {
		return (List<Medical>) medicalDAO.findAll();
	}

	@Override
    @Transactional
	public void saveMedical(Medical theMedical) {
		medicalDAO.save(theMedical);
	}


	@Override
    @Transactional
    public Optional<Medical> getMedical(int theId) {
        return medicalDAO.findById(theId);
    }
	
	@Override
    @Transactional
	public void deleteMedical(Medical theMedical) {
		medicalDAO.delete(theMedical);
		
	}

	
	
	
}
