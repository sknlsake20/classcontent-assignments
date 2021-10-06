package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.Volunteer;



public interface VolunteerService {
	  public List < Volunteer > getVolunteers();

	    public void saveVolunteer(Volunteer theVolunteer);

	    public Optional<Volunteer> getVolunteer(int theId);

	    public void deleteVolunteer(Volunteer theVolunteer);

}
