package services;

import models.Ammunition;
import models.Glocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import repositories.AmmunitionRepository;
import repositories.GlocksRepository;

@Service
public class AmmunitionService {

    @Autowired
    private AmmunitionRepository ammunitionRepo;

    // Can write extentions of (or simple duplications of) repository methods
    public Iterable<Ammunition> getALL() {
        return ammunitionRepo.findAll();
    }

}
