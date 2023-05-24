package services;

import models.Calibers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CalibersRepository;

@Service
public class CalibersService {

    @Autowired
    private CalibersRepository caliberRepo;

    // Can write extentions of (or simple duplications of) repository methods
    public Iterable<Calibers> getALLCalibers() {
        return caliberRepo.findAll();
    }

}
