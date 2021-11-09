package com.accenture.droolsdemo.controller;

import com.accenture.droolsdemo.model.Application;
import com.accenture.droolsdemo.model.Customer;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreditIncreaseController {

    @Autowired
    private KieSession session;

    @RequestMapping(value = "/letter", method = RequestMethod.GET)
    public String getCreditIncreasePage(Model model, @RequestParam String name, @RequestParam int age, @RequestParam int tenure) {
        
        Application application = new Application(name, age);
        Customer customer = new Customer(application, tenure);

        session.insert(customer);
        session.fireAllRules();

        System.out.println(customer.toString());
        model.addAttribute("customerName", name);
        model.addAttribute("previousCreditLimit", customer.getCurrCreditLimit());
        model.addAttribute("newCreditLimit", customer.getNewCreditLimit());
        
        model.addAttribute("customerAllowedExtension", customer.getIsOverForty());
        model.addAttribute("extendedLimit", customer.getOptionalCredit());

        return "credit_increase";
    }
}
