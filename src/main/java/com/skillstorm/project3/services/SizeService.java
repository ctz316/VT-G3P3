package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Size;
import com.skillstorm.project3.repositories.SizeRepository;

@Service
public class SizeService {

    @Autowired
    private SizeRepository sizeRepo;

    public Iterable<Size> getAllSizes() {
        return sizeRepo.findAll();
    }
}
