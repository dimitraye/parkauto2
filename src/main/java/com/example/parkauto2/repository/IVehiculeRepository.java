package com.example.parkauto2.repository;

import com.example.parkauto2.entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicule extends JpaRepository<Vehicule, Long> {
}
