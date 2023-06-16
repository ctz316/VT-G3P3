package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.project3.models.Caliber;
import com.skillstorm.project3.services.CaliberService;

@RestController
@RequestMapping("/calibers")
@CrossOrigin(origins = "*")
public class CaliberController {

    @Autowired
    private CaliberService calService;

    @GetMapping("/all")
    public Iterable<Caliber> getAllCalibers() {
        return calService.getAllCalibers();
    }
    
    @GetMapping("/{id}")
    public Caliber getCaliberById(@PathVariable int id) {
    	return calService.getCaliberById(id);
    }
    
    @PostMapping("/new")
    public ResponseEntity<Caliber> addCaliber(@RequestBody Caliber caliber) {
    	if(!calService.checkCaliberExists(caliber.getCaliberId())) {
    		Caliber temp = calService.addCaliber(caliber);
    		if(temp != null) {
    			return ResponseEntity.status(HttpStatus.CREATED).body(temp);
			}
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(caliber);
    }
    
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Caliber> deleteCaliber(@PathVariable int id) {
		if (calService.deleteCaliberById(id)) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
    
    @PutMapping("/upd")
	public ResponseEntity<Caliber> updateCaliber(@RequestBody Caliber caliber) {
		if(caliber != null && calService.checkCaliberExists(caliber.getCaliberId())) {
			return ResponseEntity.status(HttpStatus.OK).body(calService.updateCaliber(caliber));
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
}