package fr.iut.janviercoutardconcession.model;

import java.util.*;
import org.springframework.data.annotation.Id;

/**
 * Client entity.
 */
public class Client {

  /**
   * Client's id.
   */
  @Id
  public String id;

  /**
   *   Clients's last name.
   */
  public String nom;

  /**
   *   Clients's first name.
   */
  public String prenom;

  /**
   *   Clients's factures.
   */
  public List<Facture> factures;

  /**
   *   Clients's date of creation.
   */
  public Date date_creation_compte;

  public int schema_version;

  public Client() {}

  /**
   *   Create a client.
   * @param nom The clients’s last name.
   * @param prenom The clients’s first name.
   * @param factures The clients’s list of facture.
   * @param date_creation_compte The clients’s date of creation.
   */
  public Client(
    String nom,
    String prenom,
    List<Facture> factures,
    Date date_creation_compte,
    int schema_version
  ) {
    this.nom = nom;
    this.prenom = prenom;
    this.factures = factures;
    this.date_creation_compte = date_creation_compte;
    this.schema_version = schema_version;
  }

  /**
   *   Set the client's last name.
   * @param nom The clients’s last name.
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   *   Set the client's first name.
   * @param prenom The clients’s first name.
   */
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  /**
   *   Set the client's list of facture.
   * @param factures The clients’s list of facture.
   */
  public void setFactures(List<Facture> factures) {
    this.factures = factures;
  }

  /**
   *   Set the client's date of creation.
   * @param date_creation_compte The clients’s date of creation.
   */
  public void setDateCreationCompte(Date date_creation_compte) {
    this.date_creation_compte = date_creation_compte;
  }

  public void setSchemaVersion(int schema_version) {
    this.schema_version = schema_version;
  }
}
