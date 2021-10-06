package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.Contributor;

public interface ContributorService {

    public List < Contributor > getContributors();

    public void saveContributor(Contributor theContributor);

    public Optional<Contributor> getContributor(int theId);

    public void deleteContributor(Contributor theContributor);

}