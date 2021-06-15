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

    public Client() {}

    public Client(String nom, String prenom, List<Facture> factures, Date date_creation_compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.factures = factures;
        this.date_creation_compte = date_creation_compte;
    }
}