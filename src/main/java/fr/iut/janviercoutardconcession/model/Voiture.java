package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

/**
 * Voiture entity.
 */
public class Voiture {

  /**
   * Voiture's model.
   */
  public String modele;

  /**
   * Voiture's registration.
   */
  public String immatriculation;

  public Voiture() {}

  /**
   * Creates a Voiture.
   * @param modele Voiture's model.
   * @param immatriculation Voiture's registration.
   */
  public Voiture(String modele, String immatriculation) {
    this.modele = modele;
    this.immatriculation = immatriculation;
  }
}
