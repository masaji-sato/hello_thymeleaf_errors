package com.example.controller;

import com.example.model.A;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {


    // th:object example
    @GetMapping(value = "/test02")
    String getTest02(@ModelAttribute A a, Model model) {
        model.addAttribute("a", new A());
        return "test02";
    }
    @PostMapping(value = "/test02")
    String postTest02(@ModelAttribute @Validated A a, BindingResult bindingResult,
                      Model model) {
        return "test02";
    }



    // th:text example
    @GetMapping(value = "/test03")
    String getTest03HasGetter(@ModelAttribute A a, Model model) {
        model.addAttribute("a", new A());
        return "test03";
    }
    @PostMapping(value = "/test03")
    String postTest03HasGetter(@ModelAttribute A a, Model model) {
        return "test03";
    }



    // th:value example
    @GetMapping(value = "/test04")
    String getTest04HasGetter(@ModelAttribute A a, Model model) {
        model.addAttribute("a", new A());
        return "test04";
    }
    @PostMapping(value = "/test04")
    String postTest04HasGetter(@ModelAttribute A a, Model model) {
        return "test04";
    }



}
