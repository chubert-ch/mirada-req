package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @GetMapping("/")
    public String getForm() {
        return "form";
    }
    @PostMapping("/submit-form")
    public String postForm() {
        return "completed";
    }
}
