package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.ContributorDAO;
import com.src.entity.Contributor;

@Service
public class ContributorServiceImpl implements ContributorService {

	@Autowired
    private ContributorDAO contributorDAO;

    @Override
    @Transactional
    public List < Contributor > getContributors () {
        return (List<Contributor>) contributorDAO.findAll();
    }

    @Override
    @Transactional
    public void saveContributor(Contributor theContributor) {
        contributorDAO.save(theContributor);
    }

    @Override
    @Transactional
    public Optional<Contributor> getContributor(int theId) {
        return contributorDAO.findById(theId);
    }

    @Override
    @Transactional
    public void deleteContributor(Contributor theContributor) {
        contributorDAO.delete(theContributor);
    }

	
}
