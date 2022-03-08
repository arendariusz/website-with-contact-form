package com.example.website_with_contact_form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private MailService mailService;

    public MainController(MailService mailService) {
        this.mailService = mailService;
    }

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

    @PostMapping("/kontakt")
    public String contactForm(@RequestParam String email, @RequestParam String name, @RequestParam String text) {
        mailService.sendMail(name, email, text);
        return "redirect:/kontakt";
    }
}
