package com.orangeteam.auc.controllers;

import com.orangeteam.auc.models.Attribute;
import com.orangeteam.auc.rep.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@Controller
public class GeneralController {
    @Autowired
    AttributeRepository attributeRepository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "КРЫСА") String name, Model model){
        Iterable<Attribute> attributes = attributeRepository.findAll();
        for (Attribute a: attributes){
            name = a.getName();
        }
        model.addAttribute("name", name);
        return "greeting";
    }
}
