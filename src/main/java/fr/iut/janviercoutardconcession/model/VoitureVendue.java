package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

/**
 * VoitureVendue entity.
 * This class is a children of Voiture.
 */
public class VoitureVendue extends Voiture {

  /**
   * VoitureVendue's price.
   */
  public int prix_vente;

  public VoitureVendue() {}

  /**
   * Creates a VoitureVendue.
   * @param modele VoitureVendue's model.
   * @param immatriculation VoitureVendue's registration.
   * @param prix VoitureVendue's price.
   */
  public VoitureVendue(String modele, String immatriculaion, int prix) {
    super(modele, immatriculaion);
    this.prix_vente = prix_vente;
  }
}
