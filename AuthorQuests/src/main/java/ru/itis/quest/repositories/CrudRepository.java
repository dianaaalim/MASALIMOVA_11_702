package ru.itis.quest.repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    List<T> findAll();
    Optional<T> find(Long id);
    void save(T model);
    void delete(Long id);
    void update(T model);
}

