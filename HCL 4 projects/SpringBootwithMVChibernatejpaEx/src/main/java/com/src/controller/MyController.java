package com.src.controller;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.Bus;
import com.src.model.Cab;
import com.src.model.Admin;
import com.src.service.BusInterface;
import com.src.service.CabImpl;
import com.src.service.AdminImpl;


@Controller
public class MyController {
	
  Logger logger = LoggerFactory.getLogger(MyController.class);
  
  @Autowired(required = true)
  BusInterface busservice;
  
  @Autowired
  AdminImpl admin;
	
  @Autowired
  CabImpl cab;

  @RequestMapping("/welcome")
  public String welcomepage() {
	logger.info("Welcome Page is accessed");
    return "index";
  }
	
  @RequestMapping("/loginpage")
  public String loginPage(Model m) {
    logger.info("Admin Login Page is accessed");
    Admin a = new Admin();
    m.addAttribute("admin",a);
    return "login";
  }
	
  @RequestMapping("/showlogin")
  public String displaylogin(@RequestParam("username") String username, @RequestParam("password") String password,  Model m) {	
    List<Admin> alist = admin.getUser(username,password);
    if(!(alist.isEmpty()))
    {
      return "redirect:/";
    }
    else {
      return "redirect:/loginpage";
    }
  }
	
  @RequestMapping("/")
  public String getAllBuses(Model m) {
    logger.info("List of buses page is accessed");
    List<Bus> list = busservice.getAllBuses();
    m.addAttribute("buses", list);
    return "show";
  }
	
  @RequestMapping("/addform")
  public String showAddBusForm(Model m) {	
    logger.info("Form to add new Bus is accessed");
    Bus bus = new Bus();
    m.addAttribute("bus", bus);
    return "new_bus";
  }
  
  @RequestMapping("/savebus")
  public String saveBus(@ModelAttribute("bus") Bus b) {
    busservice.addBus(b);
    return "redirect:/";		
  }
	
  @GetMapping("/showupdateform/{id}")
  public String updateBus(@PathVariable(value="id") int busid ,Model m) {
    logger.info("Form to update details is accessed");
    Bus bus = busservice.getBus(busid);
    m.addAttribute("bus", bus);
    return "update_bus";
  }
	
  @RequestMapping("/updatebus")
  public String updateBus(@ModelAttribute("bus") Bus b) {
    busservice.updateBus(b);
    return "redirect:/";	
  }
	
  @RequestMapping("/showdeleteform/{id}")
  public String deleteBus(@PathVariable(value="id") int busid) {	
    Bus bus = new Bus();
    bus.setBusid(busid);
    busservice.removeBus(bus);
    return "redirect:/";
  }
	
  @RequestMapping("/bookticket")
  public String bookTicket(Model m) {
    logger.info("Form to book ticket is accessed");
    Bus b = new Bus();
    m.addAttribute("bus", b);
    return "bookticketform";
  }
	
  @RequestMapping("/showticket")
  public String showList(@RequestParam("source") String source, @RequestParam("destination") String destination, @RequestParam("date") Date date, Model m) {
    logger.info("List of buses based on booking is accessed");
	List<Bus> list = busservice.showList(source, destination, date);
    m.addAttribute("bus", list);
    return "showbuslist";
  }
  @RequestMapping("/showtransport")
  public String showTransport(Model m) {
	logger.info("Form to book cab is accessed");
    Cab c = new Cab();
    m.addAttribute("cab", c);
    return "transport";
  }
	
  @RequestMapping("/booktransport")
  public String getAllList(@RequestParam("location") String loc,Model m) {
    List<Cab> list = cab.getList(loc);
    m.addAttribute("cab", list);
    return "bookcab";
  }

  @RequestMapping("/success")
  public String successMsg() {
	 logger.info("Ticket booked page is accessed");
     return "booked";
  }
}
