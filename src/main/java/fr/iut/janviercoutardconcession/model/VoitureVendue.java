package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class VoitureVendue extends Voiture{
    public int prix_vente;

    public VoitureVendue(){}

    public VoitureVendue(String modele, String immatriculaion, int prix) {
        super(modele, immatriculaion);
        this.prix_vente = prix_vente;
    }
}