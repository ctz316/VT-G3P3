package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.AmmunitionService;

@RestController
@RequestMapping("/ammunition")
@CrossOrigin(origins = "*")
public class AmmunitionController {

    @Autowired
    private AmmunitionService service;

}
