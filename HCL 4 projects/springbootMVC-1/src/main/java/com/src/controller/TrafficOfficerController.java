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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.src.entity.TrafficOfficer;
import com.src.service.TrafficOfficerService;

@Controller
@RequestMapping(value="/trafficofficer", method= RequestMethod.POST)
public class TrafficOfficerController {

    @Autowired
    private TrafficOfficerService trafficofficerService;

    @GetMapping("/list")
    public String listTrafficOfficer(Model theModel) {
        List < TrafficOfficer > theTrafficOfficers = trafficofficerService.getTrafficOfficerRecords();
        
        theModel.addAttribute("trafficofficers",theTrafficOfficers);
        return "list-trafficofficers"; 
        
        
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        TrafficOfficer theTrafficOfficer = new TrafficOfficer();
        theModel.addAttribute("trafficofficer", theTrafficOfficer);
        return "trafficofficer-form"; 
    }
    @PostMapping("/saveTrafficOfficer")
    public String saveTrafficOfficer(@ModelAttribute("trafficofficer") TrafficOfficer theTrafficOfficer) {
        trafficofficerService.saveTrafficOfficerRecord(theTrafficOfficer);
        return "redirect:/trafficofficer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("trafficofficerId") int theId,
        Model theModel) {
        Optional<TrafficOfficer> theTrafficOfficer = trafficofficerService.getTrafficOfficer(theId);
        theModel.addAttribute("trafficofficer", theTrafficOfficer);
        return "trafficofficer-form"; 
    }

    @GetMapping("/delete")
    public String deletetrafficOfficer(@RequestParam("trafficofficerId") int theId) {
    	TrafficOfficer to =new TrafficOfficer();
    	to.setId(theId);
        trafficofficerService.deleteTrafficOfficer(to);
        return "redirect:/trafficofficer/list";
    }
}
