package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

/**
 * Concession entity.
 */
public class Concession {

  /**
   * Concession's id.
   */
  @Id
  public String id;

  /**
   *   Concession's name.
   */
  public String nom;

  /**
   *   Concession's list of avalaible cars.
   */
  public List<Voiture> voitures_dispo;

  /**
   *   Concession's list of employees.
   */
  public List<Employe> employes;

  public int schema_version;

  public Concession() {}

  /**
   *   Create a Concession.
   * @param nom The concession’s  name.
   * @param voitures_dispo The concession's list of avalaible cars.
   * @param employes The concession's list of employees.
   */
  public Concession(
    String nom,
    List<Voiture> voitures_dispo,
    List<Employe> employes,
    int schema_version
  ) {
    this.nom = nom;
    this.voitures_dispo = voitures_dispo;
    this.employes = employes;
    this.schema_version = schema_version;
  }

  /**
   *   Set the concession's name.
   * @param nom The concession's name.
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   *   Set the concession's list of avalaible cars.
   * @param voitures_dispo concession's list of avalaible cars.
   */
  public void setVoitureDispo(List<Voiture> voitures_dispo) {
    this.voitures_dispo = voitures_dispo;
  }

  /**
   *   Set the concession's list of employees.
   * @param employes The concession's list of employees.
   */
  public void setEmployes(List<Employe> employes) {
    this.employes = employes;
  }

  public void setSchemaVersion(int schema_version) {
    this.schema_version = schema_version;
  }
}
