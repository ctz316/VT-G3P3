package repositories;

import models.Ammunition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmmunitionRepository extends CrudRepository<Ammunition, Integer>{
}
