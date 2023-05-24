package services;

import models.Holsters;
import models.Sizes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.HolstersRepository;
import repositories.SizesRepository;

@Service
public class HolstersService {

    @Autowired
    private HolstersRepository holstersRepo;

    // Can write extentions of (or simple duplications of) repository methods
    public Iterable<Holsters> getALLHolsters() {
        return holstersRepo.findAll();
    }

}
