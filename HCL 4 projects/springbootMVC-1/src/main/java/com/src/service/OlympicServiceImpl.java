package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.OlympicDAO;
import com.src.entity.Olympic;

@Service
public class OlympicServiceImpl implements OlympicService {

	@Autowired
    private OlympicDAO olympicDAO;

	@Override
	public List<Olympic> getOlympicsRecords() {
		return (List<Olympic>) olympicDAO.findAll();
	}

	@Override
	public void saveOlympicRecord(Olympic theOlympic) {
		 olympicDAO.save(theOlympic);
		
	}

	@Override
	public Optional<Olympic> getOlympic(int theId) {
		return olympicDAO.findById(theId);
	}

	@Override
	public void deleteOlympic(Olympic theOlympic) {
		olympicDAO.delete(theOlympic);
		
	}

	


}
