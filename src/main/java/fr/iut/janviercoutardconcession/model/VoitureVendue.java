package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class VoitureVendue extends Voiture{
    @Id
    public String id;

    public int prix;

    public VoitureVendue(){}

    public VoitureVendue(String modele, String immatricualion, int prix) {
        super(modele, immatricualion);
        this.prix = prix;
    }
}