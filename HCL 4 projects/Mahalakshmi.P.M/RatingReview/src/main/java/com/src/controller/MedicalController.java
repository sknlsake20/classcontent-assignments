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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Application;
import com.src.entity.Medical;
import com.src.service.MedicalService;

@Controller
@RequestMapping("/medical")
public class MedicalController {
	private static final Logger LOGGER = LogManager.getLogger(Application.class);
	 
	

    @Autowired
    private MedicalService medicalService;
    
    @GetMapping("/list")
    public String listMedicals(Model theModel) {
    	LogManager.getLogger(Application.class);
    	
    	List <Medical > theMedicals = medicalService.getMedicals();
        theModel.addAttribute("medicals", theMedicals);
        return "list-medicals";
    }
    
    @GetMapping("/showMedical")
    public String showFormForAdd(Model theModel) {
    	LogManager.getLogger(Application.class);
    	
        Medical theMedical = new Medical();
        theModel.addAttribute("medical", theMedical);
        return "writeRR";
    }

    @PostMapping("/saveMedical")
    public String saveMedical(@ModelAttribute("medical") Medical theMedical) {
    	LogManager.getLogger(Application.class);
    	
    	medicalService.saveMedical(theMedical);
        return "redirect:/medical/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("medicalId") int theId,
        Model theModel) {
    	LogManager.getLogger(Application.class);
    	
    	Optional<Medical> theMedical = medicalService.getMedical(theId);
        theModel.addAttribute("medical", theMedical);
        return "writeRR";
    }

    @GetMapping("/delete")
    public String deletemedical(@RequestParam("medicalId") int theId) {
    	LogManager.getLogger(Application.class);
    	
    	Medical m =new Medical();
    	m.setMid(theId);
        medicalService.deleteMedical(m);
        return "redirect:/medical/list";
        
    }
    
    
    
   
}
