package com.rbt.mvcdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rbt.mvcdemo.dto.UserForm;

@Controller
public class HomeController {
	

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Hello from Spring Boot with Thymeleaf!");
        List<String> names=new ArrayList<>();
        names.add("Jayanta");
        names.add("Amit");
        names.add("Sagar");
        model.addAttribute("items",names);
        return "index"; // Refers to src/main/resources/templates/index.html
    }
    
    @GetMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("userForm", new UserForm()); // Add an empty form object to the model
        return "dataform"; // Return the name of your Thymeleaf template (e.g., form.html)
    }
    
    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("userForm") UserForm userForm, Model model) {
        // Access the data from the userForm object
        String name = userForm.getName();
        String email = userForm.getEmail();
        System.out.println(userForm);
        model.addAttribute("submittedUser", userForm); // Add the submitted data to display on a result page
        return "index"; // Return the name of your result Thymeleaf template
    }

}
