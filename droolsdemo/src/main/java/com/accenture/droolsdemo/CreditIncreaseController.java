package com.accenture.droolsdemo;

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
    public String getCreditIncreasePage(Model model, @RequestParam String name, @RequestParam int age, @RequestParam int creditLimit, @RequestParam int activeYears) {
        
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAge(age);
        customer.setCreditLimit(creditLimit);
        customer.setActiveYears(activeYears);
        model.addAttribute("previousCreditLimit", customer.getCreditLimit());

        session.insert(customer);
        session.fireAllRules();

        model.addAttribute("customerName", customer.getName());
        model.addAttribute("activeYears", activeYears);
        model.addAttribute("newCreditLimit", customer.getCreditLimit());
        model.addAttribute("customerAllowedExtension", customer.getCustomerAllowedExtension());

        if(customer.getCustomerAllowedExtension() == true) {
            model.addAttribute("bonusIncreasePercent", customer.getBonusIncreasePercent());
        }
        
        return "credit_increase";
    }
    
}
