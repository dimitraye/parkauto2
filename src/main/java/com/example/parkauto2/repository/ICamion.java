package com.example.parkauto2.repository;

import com.example.parkauto2.entity.Camion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICamion extends JpaRepository<Camion, Long> {
}
