package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.Olympic;

public interface OlympicService {

	 public List < Olympic > getOlympicsRecords();

	    public void saveOlympicRecord(Olympic theOlympic);

	    public Optional<Olympic> getOlympic(int theId);

	    public void deleteOlympic(Olympic theOlympic);

}
