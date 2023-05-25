package repositories;

import org.springframework.data.repository.CrudRepository;

import models.UserPermissions;

public interface PermissionsRepository extends CrudRepository<UserPermissions, Integer> {

}
