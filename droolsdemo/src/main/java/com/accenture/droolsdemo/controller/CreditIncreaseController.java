package com.accenture.droolsdemo.controller;

import com.accenture.droolsdemo.model.Applicant;

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
    public String getCreditIncreasePage(Model model, @RequestParam String name, @RequestParam int age, @RequestParam double currLimit, @RequestParam int yearsTogether) {

        Applicant applicant = new Applicant();
         applicant.setName(name);
         applicant.setAge(age);
         applicant.setYearsTogether(yearsTogether);
         applicant.setLimit(currLimit);
         applicant.setOptionalBonus(0);
         applicant.setLimitIncrease(0);
  
        session.insert(applicant);
        session.fireAllRules();

        model.addAttribute("applicant", applicant);
        
        // System.out.println(applicant.getLimitIncrease());
        // System.out.println(applicant.getLimit());

        double newLimit = applicant.getLimit() + applicant.getLimit()*(applicant.getLimitIncrease()/100);
        model.addAttribute("newCreditLimit", newLimit);
        // System.out.println(newLimit);

        if(age > 40) {
            model.addAttribute("customerAllowedExtension", true); 
            model.addAttribute("extendedLimit", newLimit + newLimit *(applicant.getOptionalBonus()/100));
        }

        return "credit_increase";
    }
}
