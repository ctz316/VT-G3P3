package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.UserManagementService;

@RestController
@RequestMapping("/ammunition")
@CrossOrigin(origins = "*")
public class UsersController {
	
	@Autowired
	UserManagementService userServ;
	
}
