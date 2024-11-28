package com.example.parkauto2.repository;

import com.example.parkauto2.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoiture extends JpaRepository<Voiture, Long> {
}
