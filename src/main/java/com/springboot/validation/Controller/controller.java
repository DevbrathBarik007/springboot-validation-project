package com.springboot.validation.Controller;

import com.springboot.validation.Entity.loginForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
    @GetMapping("/form")
    public String openForm(Model m){
        System.out.println("Opening form");
        m.addAttribute("loginForm",new loginForm());
        return "form";
    }

    //handler for processing form
    @PostMapping("/valid")
    public String processForm(@Valid @ModelAttribute("loginForm") loginForm loginForm, BindingResult result){
        if(result.hasErrors()){
            System.out.println(result);
            return "form";
        }
        System.out.println("login-Form");
        return "success";
    }
}
