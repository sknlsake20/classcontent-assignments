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

import com.src.entity.Volunteer;
import com.src.service.VolunteerService;

@Controller
@RequestMapping("/volunteer")
public class VolunteerController {
	@Autowired
    private VolunteerService volunteerService;
    
    
    @GetMapping("/list")
    public String listVolunteers(Model theModel) {
        List < Volunteer > theVolunteers = volunteerService.getVolunteers();
        
        theModel.addAttribute("volunteers", theVolunteers);
        return "list-volunteers";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Volunteer theVolunteer = new Volunteer();
        theModel.addAttribute("volunteer", theVolunteer);
        return "volunteer-form";
    }

    @PostMapping("/saveVolunteer")
    public String saveVolunteer(@ModelAttribute("customer") Volunteer theVolunteer) {
        volunteerService.saveVolunteer(theVolunteer);
        return "redirect:/volunteer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("volunteerId") int theId,
        Model theModel) {
        Optional<Volunteer> theVolunteer = volunteerService.getVolunteer(theId);
        theModel.addAttribute("volunteer", theVolunteer);
        return "volunteer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("volunteerId") int theId) {
    	Volunteer c =new Volunteer();
    	c.setId(theId);
        volunteerService.deleteVolunteer(c);
        return "redirect:/volunteer/list";
    }


}
