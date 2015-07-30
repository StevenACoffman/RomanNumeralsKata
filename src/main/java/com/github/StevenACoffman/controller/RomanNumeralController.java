package com.github.StevenACoffman.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.StevenACoffman.domain.RomanNumeralForm;

@Controller
@RequestMapping(value = "/")
public class RomanNumeralController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(RomanNumeralController.class);
    
    @RequestMapping(method = RequestMethod.GET)
    public String getApplicationForm(Model model) {
        model.addAttribute("romanNumeralForm", new RomanNumeralForm());
        return "form";
        
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String postApplicationForm(HttpServletRequest request, @Valid RomanNumeralForm romanNumeralForm, Model model) {
        model.addAttribute("romanNumeralForm", romanNumeralForm);
        return "form";
        
    }
}
