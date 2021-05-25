package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class Concession {
    @Id
    public String id;

    public String nom;

    public List<Voiture> voitures;

    public List<Employe> employes;

    public Concession() {}

    public Concession(String nom, List<Voiture> voitures, List<Employe> employes) {
        this.nom = nom;
        this.voitures = voitures;
        this.employes = employes;
    }
}