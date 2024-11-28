package com.example.parkauto2.service;

import com.example.parkauto2.entity.Vehicule;
import com.example.parkauto2.repository.IVehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeServvice {

    @Autowired
    IVehiculeRepository vehiculeRepository;

    //Liste des véhicules
    public List<Vehicule> getVehicules() {
        return vehiculeRepository.findAll();
    }

    public Vehicule saveVehicules(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    public Vehicule findByIdVehicule(Long  idVehicule) {
        return vehiculeRepository.findById(idVehicule).get();
    }

    public void deleteVehicule(Vehicule vehicule) {
        vehiculeRepository.delete(vehicule);
    }
}
