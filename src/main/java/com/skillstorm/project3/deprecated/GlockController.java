package com.skillstorm.project3.deprecated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.services.GlockService;

@RestController
@RequestMapping("/glocks")
@CrossOrigin(origins = "*")
public class GlockController {

    @Autowired
    private GlockService service;

    @GetMapping
    public void test() {
        System.out.println("Test");
    }

}
