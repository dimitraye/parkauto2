package com.example.parkauto2.service;

import com.example.parkauto2.entity.Voiture;
import com.example.parkauto2.repository.IVoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService {

    @Autowired
    IVoitureRepository voitureRepository;

    //Liste des véhicules
    public List<Voiture> getVoitures() {
        return voitureRepository.findAll();
    }

    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    public Voiture findByIdVoiture(Long  idVoiture) {
        return voitureRepository.findById(idVoiture).get();
    }

    public void deleteVoiture(Voiture voiture) {
        voitureRepository.delete(voiture);
    }
}
