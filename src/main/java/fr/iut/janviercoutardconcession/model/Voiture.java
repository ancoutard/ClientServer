package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class Voiture {
    @Id
    public String id;

    public String modele;

    public String immatricualion;

    public Voiture(){}

    public Voiture(String modele, String immatricualion){
        this.modele = modele;
        this.immatricualion = immatricualion;
    }
}