package repositories;

import org.springframework.data.repository.CrudRepository;

import models.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
