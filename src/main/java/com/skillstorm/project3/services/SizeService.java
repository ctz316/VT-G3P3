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
    
    public boolean checkSizeExists(int id) {
		return sizeRepo.existsById(id);
	}

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
    public Size addSize (Size size) {
    	if (!sizeRepo.existsById(size.getSizeId())) {
    		return sizeRepo.save(size);	
		}
		return null;
	}
    
    // DELETE
    public boolean deleteSizeById (int id) {
    	if (checkSizeExists(id)) {
    		sizeRepo.deleteById(id);
    		return !checkSizeExists(id);
		} else {
			return !checkSizeExists(id);
		}	
    }
    
    // UPDATE
    public Size updateSize (Size size) {
    	if (checkSizeExists(size.getSizeId())) {
    		return sizeRepo.save(size);
    	}
    	return null;
    }
}