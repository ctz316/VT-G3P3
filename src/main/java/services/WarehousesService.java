package services;

import models.Warehouses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.WarehousesRepository;

@Service
public class WarehousesService {

    @Autowired
    private WarehousesRepository warehouseRepo;

    // Can write extentions of (or simple duplications of) repository methods
    public Iterable<Warehouses> getAllWarehouses() {
        return warehouseRepo.findAll();
    }

}
