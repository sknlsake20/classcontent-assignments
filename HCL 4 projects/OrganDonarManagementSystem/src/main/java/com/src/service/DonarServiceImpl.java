package com.src.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.DonarDAO;
import com.src.entity.Donar;

@Service
public class DonarServiceImpl implements DonarService {
	@Autowired
	private DonarDAO donarDAO;

	@Override
	@Transactional
	public List<Donar> getDonars() {
		return (List<Donar>) donarDAO.findAll();
		
	}

	@Override
	@Transactional
	public void saveDonar(Donar theDonar) {
		donarDAO.save(theDonar);
		
	}

	

	@Override
	@Transactional
	public void deleteDonar(Donar theDonar) {
		donarDAO.delete(theDonar);
		
	}

	

	@Override
	@Transactional
	public Optional<Donar> getDonar(int theId) {
		return donarDAO.findById(theId);
	}

}
