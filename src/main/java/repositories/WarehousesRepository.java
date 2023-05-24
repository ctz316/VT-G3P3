package repositories;

import models.Warehouses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehousesRepository extends CrudRepository<Warehouses, Integer>{
}
