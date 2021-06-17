package fr.iut.janviercoutardconcession.controller;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.*;
import fr.iut.janviercoutardconcession.model.*;
import fr.iut.janviercoutardconcession.repository.*;

import java.util.List;
import java.util.Optional;
import java.util.Objects;

/**
 * Les Controller vont vous permettre une exposition rapide vos {@link org.springframework.data.mongodb.repository.MongoRepository}
 * et une mise en situation de leurs cas d'usages.
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

    @GetMapping("/getClients")
    public List<Client> list() {
        List<Client> liste = repository.findAll();
        for(Client client : liste){
            if(client.schema_version != schema_version || Objects.isNull(client.schema_version)){
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

    @GetMapping("/getClientsById")
    public Client getClientByID(@RequestParam String id) {
        var clientOptional = repository.findById(id);
        if(!clientOptional.isPresent()){
            throw new CustomException("Client pas trouvé");
        }
        Client client = clientOptional.get();
        if(client.schema_version != schema_version || Objects.isNull(client.schema_version)){
            client.setNom(client.nom);
            client.setPrenom(client.prenom);
            client.setFactures(client.factures);
            client.setDateCreationCompte(client.date_creation_compte);
            client.setSchemaVersion(schema_version);
        }   
        return client;
    }

    @GetMapping("/getClientsByName")
    public List<Client> getClientByName(@RequestParam String prenom) {
        List<Client> clients = repository.findByTheClientFirstname(prenom);
        if(clients == null){
            throw new CustomException("Client pas trouvé");
        }
        for(Client client : clients){
            if(client.schema_version != schema_version || Objects.isNull(client.schema_version)){
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

    @PostMapping("/postClient")
    public Client insert(@RequestBody Client entity) {
        if (entity == null) {
            throw new CustomException("Must be not null");
        }
        return repository.save(entity);
    }

    @PutMapping("/putClient")
    public Client modifierClient(@RequestBody Client client){
        System.out.println(client);
        Optional<Client> cli = repository.findById(client.id);
        if(!cli.isPresent()){
            throw new CustomException("Client pas trouvé");
        }
        return repository.save(client);
    }

    @DeleteMapping("/deleteClient")
    public String delete(@RequestParam String id){
        var client = repository.findById(id);
        if(!client.isPresent()){
            throw new CustomException("Client pas trouvé");
        }
        repository.delete(client.get());
        return "Client Successfully deleted !";
    }
}