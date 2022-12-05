package com.nest.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontroller
{
    @PostMapping("/")
public String ProductHomePage()
{
    return "Welcome to Product Home Page";
}

}
