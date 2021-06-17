package fr.iut.janviercoutardconcession.controller;

import fr.iut.janviercoutardconcession.model.*;
import fr.iut.janviercoutardconcession.repository.*;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.*;

/**
 * Controller exposing all the routes related to our entity Client
 */
@RestController
public class ClientController {

  final ClientRepository repository;
  private final int schema_version = 1;

  /**
   * Spring fonctionne avec de l'injection de dépendances, pas d'annotation à rajouter dans les controller,
   * pas de new, il va s'en charger pour vous grâce à l'annotation présente sur cette classe.
   */
  public ClientController(ClientRepository repository) { // Il vous faut une implem à vous pour que ça compile
    this.repository = repository;
  }

  /**
   * Route getClients to fetch all the clients
   * @return List<Client>
   */
  @GetMapping("/getClients")
  public List<Client> list() {
    List<Client> liste = repository.findAll();
    for (Client client : liste) {
      if (
        client.schema_version != schema_version ||
        Objects.isNull(client.schema_version)
      ) {
        client.setNom(client.nom);
        client.setPrenom(client.prenom);
        client.setFactures(client.factures);
        client.setDateCreationCompte(client.date_creation_compte);
        client.setSchemaVersion(schema_version);
        break;
      }
    }
    return liste;
  }

  /**
   * Route getClientsById to fetch a client by its id
   * @param id the client's id
   * @return Client
   */
  @GetMapping("/getClientsById")
  public Client getClientByID(@RequestParam String id) {
    var clientOptional = repository.findById(id);
    if (!clientOptional.isPresent()) {
      throw new CustomException("Client pas trouvé");
    }
    Client client = clientOptional.get();
    if (
      client.schema_version != schema_version ||
      Objects.isNull(client.schema_version)
    ) {
      client.setNom(client.nom);
      client.setPrenom(client.prenom);
      client.setFactures(client.factures);
      client.setDateCreationCompte(client.date_creation_compte);
      client.setSchemaVersion(schema_version);
    }
    return client;
  }

  /**
   * Route getClientsByName to fetch a client by its name
   * @param prenom the client's name
   * @return List<Client>
   */
  @GetMapping("/getClientsByName")
  public List<Client> getClientByName(@RequestParam String prenom) {
    List<Client> clients = repository.findByTheClientFirstname(prenom);
    if (clients == null) {
      throw new CustomException("Client pas trouvé");
    }
    for (Client client : clients) {
      if (
        client.schema_version != schema_version ||
        Objects.isNull(client.schema_version)
      ) {
        client.setNom(client.nom);
        client.setPrenom(client.prenom);
        client.setFactures(client.factures);
        client.setDateCreationCompte(client.date_creation_compte);
        client.setSchemaVersion(schema_version);
        break;
      }
    }
    return clients;
  }

  /**
   * Route postClient to create a new client
   * @param entity the new client
   * @return Client
   */
  @PostMapping("/postClient")
  public Client insert(@RequestBody Client entity) {
    if (entity == null) {
      throw new CustomException("Must be not null");
    }
    return repository.save(entity);
  }

  /**
   * Route putClient to modify an existing client
   * @param client the modified client
   * @return Client
   */
  @PutMapping("/putClient")
  public Client modifierClient(@RequestBody Client client) {
    System.out.println(client);
    Optional<Client> cli = repository.findById(client.id);
    if (!cli.isPresent()) {
      throw new CustomException("Client pas trouvé");
    }
    return repository.save(client);
  }

  /**
   * Route deleteClient to delete a client
   * @param id the client's id
   * @return String
   */
  @DeleteMapping("/deleteClient")
  public String delete(@RequestParam String id) {
    var client = repository.findById(id);
    if (!client.isPresent()) {
      throw new CustomException("Client pas trouvé");
    }
    repository.delete(client.get());
    return "Client Successfully deleted !";
  }
}
