package com.rbt.mvcdemov2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rbt.mvcdemov2.entity.User;
import com.rbt.mvcdemov2.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/home")
	String home(Model model)
	{
		model.addAttribute("data","Jayanta");
		List<String> listName=new ArrayList<>();
		listName.add("Jayanta");
		listName.add("Amit");
		listName.add("Vasu");
		model.addAttribute("list",listName);
		
		return "index";
		
	}
	@GetMapping("/showform")
	String showForm(Model model)
	{
		
	  User user= new User();
	  model.addAttribute("userForm",user);
	  return "userentry";
	}
	
	@PostMapping("/submitForm")
	String submitForm(@ModelAttribute("userForm") User user,   Model model)
	{
	  System.out.println(user);
	  userService.save(user);
	  
	  return "index";
	}
	
	@GetMapping("/list")
	String showList(Model model)
	{
		List<User>  list= userService.findAll();
		model.addAttribute("list",list);
		
		return "listdata";
		
	}
	
	@GetMapping("/list1")
	ModelAndView showList1(Model model)
	{
		ModelAndView mv= new ModelAndView("listdata");
		
		List<User>  list= userService.findAll();
		//model.addAttribute("list",list);
		mv.addObject("list",list);
		
		return mv;
		
	}


}
