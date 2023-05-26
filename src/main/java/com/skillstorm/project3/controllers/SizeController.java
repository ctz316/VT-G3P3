package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.services.SizeService;

@RestController
@RequestMapping("/sizes")
@CrossOrigin(origins = "*")
public class SizeController {

    @Autowired
    private SizeService service;

    @GetMapping
    public void test() {
        System.out.println("Test");
    }

}
