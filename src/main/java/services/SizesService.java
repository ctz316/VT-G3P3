package services;

import models.Sizes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.SizesRepository;

@Service
public class SizesService {

    @Autowired
    private SizesRepository sizesRepo;

    // Can write extentions of (or simple duplications of) repository methods
    public Iterable<Sizes> getALLSizes() {
        return sizesRepo.findAll();
    }
}
