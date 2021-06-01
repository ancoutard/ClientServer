package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class Voiture {
    @Id
    public String id;

    public String modele;
    
    public String immatriculation;

    public Voiture(){}

    public Voiture(String modele, String immatriculation){
        this.modele = modele;
        this.immatriculation = immatriculation;
    }
}