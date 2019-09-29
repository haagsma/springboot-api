package com.springlearn.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserWebService {

    @GetMapping("/info")
    public Map<String, String> userInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("Nome", "Jhonatan");
        return info;
    }
}
