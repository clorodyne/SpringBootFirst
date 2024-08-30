package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @RequestMapping("/")
    public String home(){
        return "Hello world";
    }
}
