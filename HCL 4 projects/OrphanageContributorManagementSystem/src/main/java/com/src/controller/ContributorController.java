package com.src.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.src.entity.Contributor;
import com.src.service.ContributorService;

@Controller
@RequestMapping("/contributor")
public class ContributorController {

    @Autowired
    private ContributorService contributorService;
    
    
    @GetMapping("/list")
    public String listContributors(Model theModel) {
        List < Contributor > theContributors = contributorService.getContributors();
        
        theModel.addAttribute("contributors", theContributors);
        return "list-contributors";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Contributor theContributor = new Contributor();
        theModel.addAttribute("contributor", theContributor);
        return "contributor-form";
    }

    @PostMapping("/saveContributor")
    public String saveContributor(@ModelAttribute("contributor") Contributor theContributor) {
        contributorService.saveContributor(theContributor);
        return "redirect:/contributor/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("contributorId") int theId,
        Model theModel) {
        Optional<Contributor> theContributor = contributorService.getContributor(theId);
        theModel.addAttribute("contributor", theContributor);
        return "contributor-form";
    }

    @GetMapping("/delete")
    public String deleteContributor(@RequestParam("contributorId") int theId) {
    	Contributor c =new Contributor();
    	c.setId(theId);
        contributorService.deleteContributor(c);
        return "redirect:/contributor/list";
    }
}

