package ru.itis.master_model.repositories;


import ru.itis.master_model.models.City;
import ru.itis.master_model.models.Master;
import ru.itis.master_model.models.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User> {
    List<User> findAllByCity(City city);
    List<User> findAllByFirstName(String firstName);
    List<User> findAll();
}
