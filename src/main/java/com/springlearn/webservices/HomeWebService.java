package com.springlearn.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeWebService {

    @GetMapping("/home")
    public String home() {
        return "Home Component";
    }
}
