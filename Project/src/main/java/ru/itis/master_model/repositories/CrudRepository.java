package ru.itis.master_model.repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    Optional<T> read(Long id);
    void create(T model);
    void delete(Long id);
    void update(Long id, T model);

}
