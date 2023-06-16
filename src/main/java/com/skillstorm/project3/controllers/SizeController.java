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
import com.skillstorm.project3.models.Size;
import com.skillstorm.project3.services.SizeService;

@RestController
@RequestMapping("/sizes")
@CrossOrigin(origins = "*")
public class SizeController {

    @Autowired
    private SizeService sizeService;

    @GetMapping("/all")
    public Iterable<Size> getAllSizes() {
        return sizeService.getAllSizes();
    }
    
    @GetMapping("/{id}")
    public Size getSizeById(@PathVariable int id) {
    	return sizeService.getSizeById(id);
    }
    
    @PostMapping("/new")
    public ResponseEntity<Size> addSize(@RequestBody Size size) {
    	if(!sizeService.checkSizeExists(size.getSizeId())) {
    		Size temp = sizeService.addSize(size);
    		if(temp != null) {
    			return ResponseEntity.status(HttpStatus.CREATED).body(temp);
			}
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(size);
    }
    
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Size> deleteSize(@PathVariable int id) {
		if (sizeService.deleteSizeById(id)) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
    
    @PutMapping("/upd")
	public ResponseEntity<Size> updateSize(@RequestBody Size size) {
		if(size != null && sizeService.checkSizeExists(size.getSizeId())) {
			return ResponseEntity.status(HttpStatus.OK).body(sizeService.updateSize(size));
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
}