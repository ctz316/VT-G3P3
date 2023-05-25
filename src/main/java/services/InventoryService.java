package services;

import models.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.InventoryRepository;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepo;

    // Can write extentions of (or simple duplications of) repository methods
    public Iterable<Inventory> getAllInventory() {
        return inventoryRepo.findAll();
    }

}
