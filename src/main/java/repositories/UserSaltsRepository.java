package repositories;

import org.springframework.data.repository.CrudRepository;

import models.UserSalts;

public interface UserSaltsRepository extends CrudRepository<UserSalts, Integer> {

}
