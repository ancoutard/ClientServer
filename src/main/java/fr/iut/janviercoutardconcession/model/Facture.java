package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class Facture {
    // @Id
    // public String id;

    public Date date;

    public float montant;

    public Facture() {}

    public Facture(Date date, float montant) {
        this.date = date;
        this.montant = montant;
    }
}