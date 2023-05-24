package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CalibersService;

@RestController
@RequestMapping("/caliber")
@CrossOrigin(origins = "*")
public class CalibersController {

        @Autowired
        private CalibersService service;

        @GetMapping
        public void test() {
                System.out.println("Test");
        }

}
