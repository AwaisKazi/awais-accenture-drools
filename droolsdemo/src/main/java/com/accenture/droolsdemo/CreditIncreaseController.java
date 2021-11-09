package com.accenture.droolsdemo;


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
    public String getCreditIncreasePage(Model model, @RequestParam String name, @RequestParam int age,
    @RequestParam int yearsACustomer, double creditLimit) {
        
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAge(age);
        customer.setYearsACustomer(yearsACustomer);
        customer.setCreditLimit(creditLimit);
        session.insert(customer);    
    
        model.addAttribute("customer", customer);
        
        
        // if(age > 50) {
        //     model.addAttribute("customerAllowedExtension", true);
        // }
        

        session.fireAllRules();
        return "credit_increase";

     
        
    }
}
