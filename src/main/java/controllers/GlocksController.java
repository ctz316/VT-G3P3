package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.GlocksService;

@RestController
@RequestMapping("/glocks")
@CrossOrigin(origins = "*")
public class GlocksController {

    @Autowired
    private GlocksService service;

    @GetMapping
    public void test() {
        System.out.println("Test");
    }

}
