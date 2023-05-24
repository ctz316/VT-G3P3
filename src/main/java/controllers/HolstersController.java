package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.HolstersService;

@RestController
@RequestMapping("/holsters")
@CrossOrigin(origins = "*")
public class HolstersController {

    @Autowired
    private HolstersService service;

    @GetMapping
    public void test() {
        System.out.println("Test");
    }

}
