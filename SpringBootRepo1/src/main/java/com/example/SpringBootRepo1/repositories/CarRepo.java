package com.example.SpringBootRepo1.repositories;

import com.example.SpringBootRepo1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepo extends JpaRepository<Car, Long> {
}
