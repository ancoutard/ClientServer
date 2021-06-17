package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class Client {
    @Id
    public String id;

    public String nom;

    public String prenom;

    public List<Facture> factures;

    public Date date_creation_compte;

    public int schema_version;

    public Client() {}

    public Client(String nom, String prenom, List<Facture> factures, Date date_creation_compte,  int schema_version) {
        this.nom = nom;
        this.prenom = prenom;
        this.factures = factures;
        this.date_creation_compte = date_creation_compte;
        this.schema_version = schema_version;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setFactures(List<Facture> factures){
        this.factures = factures;
    }

    public void setDateCreationCompte(Date date_creation_compte){
        this.date_creation_compte = date_creation_compte;
    }

    public void setSchemaVersion(int schema_version){
        this.schema_version = schema_version;
    }
}