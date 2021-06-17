package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

/**
 * Facture entity.
 */
public class Facture {

  // @Id
  // public String id;

  /**
   * Facture's date.
   */
  public Date date;

  /**
   * Facture's invoice.
   */
  public float montant;

  public Facture() {}

  /**
   * Creates a Facture.
   * @param date Facture's date.
   * @param montant Facture's invoice.
   */
  public Facture(Date date, float montant) {
    this.date = date;
    this.montant = montant;
  }
}
