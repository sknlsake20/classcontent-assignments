package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.TrafficOfficer;

public interface TrafficOfficerService {

	 public List < TrafficOfficer > getTrafficOfficerRecords();

	    public void saveTrafficOfficerRecord(TrafficOfficer thetrafficOfficer);

	    public Optional<TrafficOfficer> getTrafficOfficer(int theId);

	    public void deleteTrafficOfficer(TrafficOfficer theTrafficOfficer);

}
