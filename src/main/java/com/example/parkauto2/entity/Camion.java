package com.example.parkauto2.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "camion")
public class Camion extends Vehicule{

    @Override
    public String demarrer(){
        return "BRRRRRRRRR !!";
    }

    @Override
    public String accelerer(){
        return "BROUUMMMM !!";
    }

    public Camion() {
        super();
    }

    public Camion(Long matricule, int anneeModel, double prix) {
        super(matricule, anneeModel, prix);
    }
}
