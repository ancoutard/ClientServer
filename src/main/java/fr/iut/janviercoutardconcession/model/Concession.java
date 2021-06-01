package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class Concession {
    @Id
    public String id;

    public String nom;

    public List<Voiture> voitures_dispo;

    public List<Employe> employes;

    public Concession() {}

    public Concession(String nom, List<Voiture> voitures_dispo, List<Employe> employes) {
        this.nom = nom;
        this.voitures_dispo = voitures_dispo;
        this.employes = employes;
    }
}