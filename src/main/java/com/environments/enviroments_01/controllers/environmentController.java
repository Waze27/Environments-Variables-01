package com.environments.enviroments_01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class environmentController {

    @Autowired
    private Environment environment;

    @Value("${devName.customVar}")
    String devName;

    @GetMapping("")
    public String getAuthCode() {
        return environment.getProperty("authCode.customVar") + " " + devName;
    }
    
}
