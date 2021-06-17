package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

/**
 * Represents an employe and its list of sold cars.
 */
public class ConcessionAggregate {

  /**
   * Employe's id.
   */
  @Id
  public Employe employe;

  /**
   * Employe's list of sold cars.
   */
  public List<VoitureVendue> voitures_vendues;

  public int total_nb_voitures_vendues;

  public ConcessionAggregate() {}

  public ConcessionAggregate(
    Employe employe,
    List<VoitureVendue> voitures_vendues,
    int total_nb_voitures_vendues
  ) {
    this.employe = employe;
    this.voitures_vendues = voitures_vendues;
    this.total_nb_voitures_vendues = total_nb_voitures_vendues;
  }
}
