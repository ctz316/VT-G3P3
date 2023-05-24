package repositories;

import models.Sizes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizesRepository extends CrudRepository<Sizes, Integer>{
}
