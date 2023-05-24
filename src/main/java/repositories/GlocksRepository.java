package repositories;

import models.Glocks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlocksRepository extends CrudRepository<Glocks, Integer>{
}
