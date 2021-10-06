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

import com.src.entity.Donar;
import com.src.service.DonarService;



@Controller
@RequestMapping("/donar")
public class DonarController {
	
	@Autowired
    private DonarService donarService;
    
    
    @GetMapping("/list")
    public String listDonars(Model theModel) {
        List < Donar > theDonars = donarService.getDonars();
        
        theModel.addAttribute("donars", theDonars);
        return "list-donar";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Donar theDonar = new Donar();
        theModel.addAttribute("donar", theDonar);
        return "donar-form";
    }

    @PostMapping("/saveDonar")
    public String saveDonar(@ModelAttribute("donar") Donar theDonar) {
        donarService.saveDonar(theDonar);
        return "redirect:/donar/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("donarId") int theId,
        Model theModel) {
        Optional<Donar> theDonar = donarService.getDonar(theId);
        theModel.addAttribute("donar", theDonar);
        return "donar-form";
    }

    @GetMapping("/delete")
    public String deleteDonar(@RequestParam("donarId") int theId) {
    	Donar c =new Donar();
    	c.setId(theId);
        donarService.deleteDonar(c);
        return "redirect:/donar/list";
    }
    
    

}
