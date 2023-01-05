package com.helloargocd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = Logger.getLogger(String.valueOf(HelloController.class));
    
    @GetMapping("/")
    public String helloArgo(){
        logger.info("Endpoint");
        return "Hello Argo";
    }
}
