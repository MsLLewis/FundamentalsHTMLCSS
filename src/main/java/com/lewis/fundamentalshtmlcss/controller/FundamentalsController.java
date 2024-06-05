package com.lewis.fundamentalshtmlcss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //handles incoming web requests
public class FundamentalsController {

    @GetMapping("/")  //endpoint   localhost:8080/
    public String index(){
        return "index";
    }


    @GetMapping("fundamentals")  //endpoint localhost:8080/fundamentals
    public String fundamentals(){
        return "fundamentals";
    }

    @GetMapping("elements")   //endpoint localhost:8080/elements
    public String htmlElements(){
        return "html-elements";
    }

}
