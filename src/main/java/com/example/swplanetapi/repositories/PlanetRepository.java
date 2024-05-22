package com.example.swplanetapi.repositories;

import com.example.swplanetapi.domain.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
}
