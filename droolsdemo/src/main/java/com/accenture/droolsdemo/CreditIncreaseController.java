package com.accenture.droolsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreditIncreaseController {
    @RequestMapping(value = "/letter", method = RequestMethod.GET)
    public String getCreditIncreasePage(Model model, @RequestParam String name, @RequestParam int age) {
        
        model.addAttribute("customerName", name);
        
        if(age > 50) {
            model.addAttribute("customerAllowedExtension", true);
        }
        
        return "credit_increase";
    }
}
