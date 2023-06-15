package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.project3.models.Size;
import com.skillstorm.project3.services.SizeService;

@RestController
@RequestMapping("/sizes")
@CrossOrigin(origins = "*")
public class SizeController {

    @Autowired
    SizeService sizeService;

    @GetMapping("/all")
    public Iterable<Size> getAllSizes() {
        return sizeService.getAllSizes();
    }
    
    @GetMapping("/{id}")
    public Size getSizeById(@PathVariable int id) {
    	return sizeService.getSizeById(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<String> addSize(@RequestBody Size size) {
    	return sizeService.addSize(size);
    }
    
    @DeleteMapping
    public ResponseEntity<String> deleteSize(int id) {
		return sizeService.deleteSizeById(id);
	}
}