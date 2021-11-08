package com.accenture.droolsdemo;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcccountCancellationController {
        
        @Autowired
	    private KieSession session;
    
        @RequestMapping(value = "/denied", method = RequestMethod.GET)
        public String getCustomerDeniedPage(Model model, @RequestParam String name, @RequestParam int creditScore) {
        
        Active customer = new Active();
        customer.setName(name);
        customer.setCreditScore(creditScore);
        
        session.insert(customer);
        session.fireAllRules();

        model.addAttribute("name", customer.getName());
        model.addAttribute("creditScore", customer.getCreditScore());
        model.addAttribute("activeCustomer", customer.getActiveCustomer());

        return "account_denied";
    }
}
