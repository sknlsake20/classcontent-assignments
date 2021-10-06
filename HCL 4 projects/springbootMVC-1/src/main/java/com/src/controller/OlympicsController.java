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

import com.src.entity.Olympic;
import com.src.service.OlympicService;

@Controller
@RequestMapping("/olympic")
public class OlympicsController {

    @Autowired
    private OlympicService olympicService;

    @GetMapping("/list")
    public String listOlympics(Model theModel) {
        List < Olympic > theOlympics = olympicService.getOlympicsRecords();
        
        theModel.addAttribute("olympics", theOlympics);
        return "list-olympics";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Olympic theOlympic = new Olympic();
        theModel.addAttribute("olympic", theOlympic);
        return "olympic-form";
    }

    @PostMapping("/saveOlympic")
    public String saveOlympic(@ModelAttribute("olympic") Olympic theOlympic) {
        olympicService.saveOlympicRecord(theOlympic);
        return "redirect:/olympic/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("olympicId") int theId,
        Model theModel) {
        Optional<Olympic> theOlympic = olympicService.getOlympic(theId);
        theModel.addAttribute("olympic", theOlympic);
        return "olympic-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("olympicId") int theId) {
    	Olympic o =new Olympic();
    	o.setId(theId);
        olympicService.deleteOlympic(o);
        return "redirect:/olympic/list";
    }
}
