package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class Concession {
    @Id
    public String id;

    public String nom;

    public List<Voiture> voitures_dispo;

    public List<Employe> employes;

    public int schema_version;

    public Concession() {}

    public Concession(String nom, List<Voiture> voitures_dispo, List<Employe> employes, int schema_version) {
        this.nom = nom;
        this.voitures_dispo = voitures_dispo;
        this.employes = employes;
        this.schema_version = schema_version;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setVoitureDispo(List<Voiture> voitures_dispo){
        this.voitures_dispo = voitures_dispo;
    }

    public void setEmployes(List<Employe> employes){
        this.employes = employes;
    }

    public void setSchemaVersion(int schema_version){
        this.schema_version = schema_version;
    }
}