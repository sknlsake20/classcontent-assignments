package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.TrafficOfficerDAO;
import com.src.entity.TrafficOfficer;

@Service
public class TrafficOfficerServiceImpl implements TrafficOfficerService {

	@Autowired
    private TrafficOfficerDAO trafficofficerDAO;

	

	@Override
	public List<TrafficOfficer> getTrafficOfficerRecords() {
		// TODO Auto-generated method stub
		return (List<TrafficOfficer>) trafficofficerDAO.findAll();

	}

	@Override
	public void saveTrafficOfficerRecord(TrafficOfficer theTrafficOfficer) {
		 trafficofficerDAO.save(theTrafficOfficer);
		
	}

	@Override
	public Optional<TrafficOfficer> getTrafficOfficer(int theId) {
		// TODO Auto-generated method stub
		return trafficofficerDAO.findById(theId);

	}

	@Override
	public void deleteTrafficOfficer(TrafficOfficer theTrafficOfficer) {
		trafficofficerDAO.delete(theTrafficOfficer);
		
	}

	


}
