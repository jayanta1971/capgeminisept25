package com.rbt.studentmgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	
   @GetMapping("/test")
  String showHome(Model model)
  {
	    
	   model.addAttribute("data","data");
	   	   return "index";
  }

}
