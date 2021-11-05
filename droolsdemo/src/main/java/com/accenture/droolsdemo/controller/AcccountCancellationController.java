package com.accenture.droolsdemo.controller;

import com.accenture.droolsdemo.model.Customer;

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

    @RequestMapping(value="/cancellation", method = RequestMethod.GET)
    public String getAccountCancelPage(Model model, @RequestParam String name, @RequestParam int yearsInactive, @RequestParam int overdraftFees){
        Customer customer = new Customer();

        customer.setName(name);
        customer.setYearsInactive(yearsInactive);
        customer.setOverdraftFees(overdraftFees);

        session.insert(customer);
        session.fireAllRules();

        if(customer.getOverdraftFees() < 5000){
            model.addAttribute("customerRejoin",true);
        }
        
        model.addAttribute("customer",customer);

        // System.out.println(customer.isCancel());
        return "account_cancellation";
    }
}
