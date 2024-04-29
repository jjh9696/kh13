package com.kh.springtest01.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ChatbotRestController {

    @GetMapping("/connect")
    public String connect() {
        return "Connected to chatbot!";
    }
}