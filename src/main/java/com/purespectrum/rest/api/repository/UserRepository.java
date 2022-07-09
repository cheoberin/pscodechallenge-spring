package com.purespectrum.rest.api.repository;

import com.purespectrum.rest.api.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
