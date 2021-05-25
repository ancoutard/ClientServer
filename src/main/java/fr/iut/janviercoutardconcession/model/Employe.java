package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

public class Employe {

  @Id
  public String id;

  public String nom;

  public String prenom;

  public List<VoitureVendue> voituresVendues;

  public Employe() {}

  public Employe(String nom, String prenom, List<VoitureVendue> voituresVendues){
      this.nom = nom;
      this.prenom = prenom;
      this.voituresVendues = voituresVendues;
  }
}
