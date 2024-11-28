package com.example.parkauto2.service;

import com.example.parkauto2.entity.Camion;
import com.example.parkauto2.repository.ICamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CamionService {

    @Autowired
    ICamionRepository camionRepository;

    //Liste des véhicules
    public List<Camion> getCamions() {
        return camionRepository.findAll();
    }

    public Camion saveCamions(Camion camion) {
        return camionRepository.save(camion);
    }

    public Camion findByIdCamion(Long  idCamion) {
        return camionRepository.findById(idCamion).get();
    }

    public void deleteCamion(Camion camion) {
        camionRepository.delete(camion);
    }
}
