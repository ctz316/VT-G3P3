package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.skillstorm.project3.models.Size;
import com.skillstorm.project3.repositories.SizeRepository;

@Service
public class SizeService {

    @Autowired
    private SizeRepository sizeRepo;

    // GETS
    public Iterable<Size> getAllSizes() {
        return sizeRepo.findAll();
    }
    
    public Size getSizeById(int id) {
    	if(sizeRepo.existsById(id)) {
			return sizeRepo.findById(id).get();
		} else {
			return null;
		}
	}
    
    // ADD
    public ResponseEntity<String> addSize (Size size) {
    	if (sizeRepo.existsById(size.getSizeId())) {
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Size with id " + size.getSizeId() + " already exists");	
		}
		return ResponseEntity.status(HttpStatus.CREATED).body("Size with id " + size.getSizeId() + " has been inserted");
	}
    
    // DELETE
    public ResponseEntity<String> deleteSizeById (int id) {
    	if (sizeRepo.existsById(id)) {
    		sizeRepo.deleteById(id);
    		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Size with id of " + id + " was successfully deleted.");
		} else {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Size with id of " + id + " does not exist!");
		}	
    }
    
    // UPDATE
    public Size updateSize (Size size) {
    	return sizeRepo.save(size);
    	}
}