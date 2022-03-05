package com.example.website_with_contact_form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/kontakt")
    public String contact() {
        return "contact";
    }

    @GetMapping("/galeria")
    public String gallery()  {
        return "gallery";
    }
}
