package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.Donar;

public interface DonarService {
	public List < Donar > getDonars();

    public void saveDonar(Donar theDonar);

    public Optional<Donar> getDonar(int theId);
    
    

    public void deleteDonar(Donar theDonar);


}
