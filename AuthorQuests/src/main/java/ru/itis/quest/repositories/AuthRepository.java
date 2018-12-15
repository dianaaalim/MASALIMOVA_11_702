package ru.itis.quest.repositories;

import ru.itis.quest.models.Auth;

import java.util.Optional;

public interface AuthRepository extends CrudRepository<Auth> {
    Optional<Auth> getByCookie(String cookieValue);}
