package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.MechanicDAO;
import com.src.entity.Mechanic;

@Service
public class MechanicServiceImpl implements MechanicService {

	@Autowired
    private MechanicDAO mechanicDAO;

	@Override
	public List<Mechanic> getMechanicsRecords() {
		return (List<Mechanic>) mechanicDAO.findAll();
	}

	@Override
	public void saveMechaniccRecord(Mechanic theMechanic) {
		mechanicDAO.save(theMechanic);
		
	}

	@Override
	public Optional<Mechanic> getMechanic(int theId) {
		return mechanicDAO.findById(theId);
	}

	@Override
	public void deleteMechanic(Mechanic theMechanic) {
		mechanicDAO.delete(theMechanic);
		
	}

	


}
