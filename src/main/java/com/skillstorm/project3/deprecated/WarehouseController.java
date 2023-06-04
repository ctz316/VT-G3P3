package com.skillstorm.project3.deprecated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.services.WarehouseService;

@RestController
@RequestMapping("/warehouse")
@CrossOrigin(origins = "*")
public class WarehouseController {

    @Autowired
    private WarehouseService service;

    @GetMapping
    public void test() {
        System.out.println("Test");
    }

}
