package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Caliber;
import com.skillstorm.project3.repositories.CaliberRepository;

@Service
public class CaliberService {

    @Autowired
    private CaliberRepository caliberRepo;

    public Iterable<Caliber> getAllCalibers() {
        return caliberRepo.findAll();
    }

}
