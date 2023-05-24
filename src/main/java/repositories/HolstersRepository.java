package repositories;

import models.Holsters;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolstersRepository extends CrudRepository<Holsters, Integer>{
}
