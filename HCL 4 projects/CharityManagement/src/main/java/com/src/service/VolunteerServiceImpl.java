package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.VolunteerDAO;
import com.src.entity.Volunteer;



@Service
public class VolunteerServiceImpl implements VolunteerService {
	@Autowired
    private VolunteerDAO volunteerDAO;
	@Override
    @Transactional
    public List < Volunteer > getVolunteers() {
        return (List<Volunteer>) volunteerDAO.findAll();
    }


    @Override
    @Transactional
    public Optional<Volunteer> getVolunteer(int theId) {
        return volunteerDAO.findById(theId);
    }

   

	@Override
	@Transactional
	public void saveVolunteer(Volunteer theVolunteer) {
		// TODO Auto-generated method stub
		volunteerDAO.save(theVolunteer);
		
	}

	@Override
	@Transactional
	public void deleteVolunteer(Volunteer theVolunteer) {
		// TODO Auto-generated method stub
		volunteerDAO.delete(theVolunteer);
		
	}


}
