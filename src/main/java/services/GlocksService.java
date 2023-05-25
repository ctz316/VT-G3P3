package services;

import models.Glocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.GlocksRepository;

@Service
public class GlocksService {

    @Autowired
    private GlocksRepository glockRepo;

    // Can write extentions of (or simple duplications of) repository methods
    public Iterable<Glocks> getAllGlocks() {
        return glockRepo.findAll();
    }
}
