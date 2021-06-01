package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

public class Employe {
  public String nom;

  public String prenom;

  public List<VoitureVendue> voitures_vendu;

  public Employe() {}

  public Employe(String nom, String prenom, List<VoitureVendue> voitures_vendu){
      this.nom = nom;
      this.prenom = prenom;
      this.voitures_vendu = voitures_vendu;
  }
}
