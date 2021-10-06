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

import com.src.entity.Mechanic;
import com.src.service.MechanicService;

@Controller
@RequestMapping("/mechanic")
public class MechanicController {

    @Autowired
    private MechanicService mechanicService;

    @GetMapping("/list")
    public String listMechanics(Model theModel) {
        List < Mechanic > theMechanics = mechanicService.getMechanicsRecords();
        
        theModel.addAttribute("mechanics", theMechanics);
        return "list-mechanics";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Mechanic theMechanic = new Mechanic();
        theModel.addAttribute("mechanic", theMechanic);
        return "mechanic-form";
    }

    @PostMapping("/saveMechanic")
    public String saveMechanic(@ModelAttribute("mechanic") Mechanic theMechanic) {
    	mechanicService.saveMechaniccRecord(theMechanic);
        return "redirect:/mechanic/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("mechanicId") int theId,
        Model theModel) {
        Optional<Mechanic> theMechanic = mechanicService.getMechanic(theId);
        theModel.addAttribute("mechanic", theMechanic);
        return "mechanic-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("mechanicId") int theId) {
    	Mechanic m =new Mechanic();
    	m.setId(theId);
    	mechanicService.deleteMechanic(m);
        return "redirect:/mechanic/list";
    }
}
