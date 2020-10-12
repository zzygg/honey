package com.zzy.honey.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/view")
public class ViewController {

    @RequestMapping("/show")
    public String show(){
        return "honey";
    }
}
