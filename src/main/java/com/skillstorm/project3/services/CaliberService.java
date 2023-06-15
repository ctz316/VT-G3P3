package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillstorm.project3.models.Caliber;
import com.skillstorm.project3.repositories.CaliberRepository;

@Service
public class CaliberService {

    @Autowired
    private CaliberRepository calRepo;
    
    public boolean checkCaliberExists(int id) {
		return calRepo.existsById(id);
	}

    // GETS
    public Iterable<Caliber> getAllCalibers() {
        return calRepo.findAll();
    }
    
    public Caliber getCaliberById(int id) {
    	if(calRepo.existsById(id)) {
			return calRepo.findById(id).get();
		} else {
			return null;
		}
	}
    
    // ADD
    public Caliber addCaliber (Caliber caliber) {
    	if (!calRepo.existsById(caliber.getCaliberId())) {
    		return calRepo.save(caliber);	
		}
		return null;
	}
    
    // DELETE
    public boolean deleteCaliberById (int id) {
    	if (checkCaliberExists(id)) {
    		calRepo.deleteById(id);
    		return !checkCaliberExists(id);
		} else {
			return !checkCaliberExists(id);
		}	
    }
    
    // UPDATE
    public Caliber updateCaliber (Caliber caliber) {
    	if (checkCaliberExists(caliber.getCaliberId())) {
    		return calRepo.save(caliber);
    	}
    	return null;
    }
}