package com.src.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Application;
import com.src.entity.Contributor;
import com.src.service.ContributorService;

@Controller
@RequestMapping("/contributor")
public class ContributorController {
	private static final Logger LOGGER=LogManager.getLogger(Application.class);
    @Autowired
    private ContributorService contributorService;
    
    
    @GetMapping("/list")
    public String listContributors(Model theModel) {
        List < Contributor > theContributors = contributorService.getContributors();
        
        theModel.addAttribute("contributors", theContributors);
        LOGGER.info("This is list contributor page");  
        return "list-contributors";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Contributor theContributor = new Contributor();
        theModel.addAttribute("contributor", theContributor);
        LOGGER.info("This is show form contributor page");  
        return "contributor-form";
    }

    @PostMapping("/saveContributor")
    public String saveContributor(@ModelAttribute("contributor") Contributor theContributor) {
        contributorService.saveContributor(theContributor);
        LOGGER.info("This is save contributor page");  
        return "redirect:/contributor/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("contributorId") int theId,
        Model theModel) {
        Optional<Contributor> theContributor = contributorService.getContributor(theId);
        theModel.addAttribute("contributor", theContributor);
        LOGGER.info("This is update form contributor page");  
        return "contributor-form";
    }

    @GetMapping("/delete")
    public String deleteContributor(@RequestParam("contributorId") int theId) {
    	Contributor c =new Contributor();
    	c.setId(theId);
        contributorService.deleteContributor(c);
        LOGGER.info("This is delete contributor page");  
        return "redirect:/contributor/list";
    }
    @RequestMapping("/logout")
	public String logout()
	{
    	LOGGER.info("This is logout page");  
		return "index";
	}
}

