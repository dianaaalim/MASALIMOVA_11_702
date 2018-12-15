package ru.itis.quest.repositories;

import ru.itis.quest.models.Order;
import ru.itis.quest.models.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User> {
    Optional<User> findByNickname(String name);

}