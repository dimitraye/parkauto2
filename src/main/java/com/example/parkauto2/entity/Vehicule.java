package com.example.parkauto2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicule")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idvehicule")
    private Long matricule;

    @Column(name = "anneemodel")
    private int anneeModel;

    @Column(name = "prix")
    private double prix;


    public Vehicule() {
    }

    public Vehicule(Long matricule, int anneeModel, double prix) {
        this.matricule = matricule;
        this.anneeModel = anneeModel;
        this.prix = prix;
    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public int getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(int anneeModel) {
        this.anneeModel = anneeModel;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString(){
        return "Vehicule [Mtricule = "+matricule + ", Année du Model = " +anneeModel +", Prix = "+prix+"]";
    }

    public String demarrer(){
        return "Brouuuuuuuuuuuuuuuuuuuuum";
    }
    public String accelerer(){
        return "Vrouuuuuuuuuuuuuuuuuuuuum";
    }
}
