package com.example.helloname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("name/")
public class NameController {

    @GetMapping("getMsg/{name}")
    public String msg(@PathVariable String name){
        return "नमस्कार " + name + " कसे आहात ?" + " सगळे" ;
    }
    //    http://localhost:8686/name/getMsg/Mikhilesh
}
