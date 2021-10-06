package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.Mechanic;

public interface MechanicService {

	 public List < Mechanic > getMechanicsRecords();

	    public void saveMechaniccRecord(Mechanic theMechanic);

	    public Optional<Mechanic> getMechanic(int theId);

	    public void deleteMechanic(Mechanic theMechanic);

}
