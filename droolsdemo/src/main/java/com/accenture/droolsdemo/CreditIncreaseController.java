package com.accenture.droolsdemo;

import org.drools.core.common.AgendaGroupQueueImpl.ClearAction;
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
    public String getCreditIncreasePage(Model model, @RequestParam String name, @RequestParam int age, @RequestParam int creditLine, @RequestParam int accountAge) {
        Customer c = new Customer();
        //model.addAttribute("customerName", name);
        c.setName(name);
        c.setAge(age);
        c.setCreditLine(creditLine);
        c.setAccountAge(accountAge); 
        
        session.insert(c);
        session.fireAllRules();

        model.addAttribute("customerName", c.getName());
        model.addAttribute("accountAge", accountAge);
        model.addAttribute("newCreditLine", c.getCreditLine());
        model.addAttribute("customerBoostEligible", c.getBoostEligible());

        if(c.getBoostEligible() == true) {
            model.addAttribute("previousCreditLimit", c.getCreditLine());
            c.setCreditIncrease(c.getCreditIncrease());
            model.addAttribute("newCreditLimit", c.getCreditLine());
        }
        
        return "credit_increase";
    }
}
