package ru.itis.master_model.repositories;

import ru.itis.master_model.models.City;
import ru.itis.master_model.models.Master;

import java.util.List;
import java.util.Optional;

public interface MasterRepositiry extends UserRepository{
    Optional<Master> findAllByAddress(String address);
}
