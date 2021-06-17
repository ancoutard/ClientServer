package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

/**
 * Employe entity.
 */
public class Employe {

  /**
   *   Employe's first name.
   */
  public String nom;

  /**
   *   Employe's last name.
   */
  public String prenom;

  /**
   *   Employe's list of sold cars.
   */
  public List<VoitureVendue> voitures_vendu;

  public Employe() {}

  /**
   *   Creates a new Employe
   * @param nom Employe's first name.
   * @param prenom Employe's last name.
   * @param voitures_vendu Employe's list of sold cars.
   */
  public Employe(
    String nom,
    String prenom,
    List<VoitureVendue> voitures_vendu
  ) {
    this.nom = nom;
    this.prenom = prenom;
    this.voitures_vendu = voitures_vendu;
  }
}
