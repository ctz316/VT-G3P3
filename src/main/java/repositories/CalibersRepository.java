package repositories;

import models.Calibers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalibersRepository extends CrudRepository<Calibers, Integer>{
}
