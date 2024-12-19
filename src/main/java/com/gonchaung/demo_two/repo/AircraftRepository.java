package com.gonchaung.demo_two.repo;

import com.gonchaung.demo_two.model.Aircraft;
import org.springframework.data.repository.CrudRepository;


public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
