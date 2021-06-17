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
public class ConcessionController {

    final ConcessionRepository repository;
    private final int schema_version = 1;


    /**
     * Spring fonctionne avec de l'injection de dépendances, pas d'annotation à rajouter dans les controller,
     * pas de new, il va s'en charger pour vous grâce à l'annotation présente sur cette classe.
     */
    public ConcessionController(ConcessionRepository repository) { // Il vous faut une implem à vous pour que ça compile
        this.repository = repository;
    }

    @GetMapping("/getConcession")
    public List<Concession> list(@RequestParam(required = false) String name) {
        List<Concession> liste = repository.findAll();
        for(Concession concession : liste){
            if(concession.schema_version != schema_version || Objects.isNull(concession.schema_version)){
                concession.setNom(concession.nom);
                concession.setVoitureDispo(concession.voitures_dispo);
                concession.setEmployes(concession.employes);
                concession.setSchemaVersion(schema_version);
                break;
            }   
        }
        return liste;
    }
    
    @GetMapping("/getConcessionByName")
    public List<Concession> getConcessionByName(@RequestParam String nom) {
        List<Concession> concessions = repository.findByTheConcessionName(nom);
        if(concessions == null){
            throw new CustomException("Aucune concession pour ce nom n'a été trouvé");
        }
        for(Concession concession : concessions){
            if(concession.schema_version != schema_version || Objects.isNull(concession.schema_version)){
                concession.setNom(concession.nom);
                concession.setVoitureDispo(concession.voitures_dispo);
                concession.setEmployes(concession.employes);
                concession.setSchemaVersion(schema_version);
                break;
            }   
        }
        return concessions;
    }

    @GetMapping("/getAllVoituresVenduesByEmploye")
    public List<ConcessionAggregate> getAllVoituresVenduesByEmploye() {
        List<ConcessionAggregate> object = repository.findAllVoituresVenduesByEmployes();
        if(object == null){
            throw new CustomException("Problème");
        }
        return object;
    }

    @PostMapping("/postConcession")
    public Concession insert(@RequestBody Concession entity) {
        System.out.println(entity);
        if (entity == null) {
            throw new CustomException("Must be not null");
        }
        return repository.save(entity);
    }

    @PutMapping("/putConcession")
    public Concession modifierConcession(@RequestBody Concession concession){
        System.out.println(concession.id);
        Optional<Concession> concess = repository.findById(concession.id);
        if(!concess.isPresent()){
            throw new CustomException("Concession pas trouvé");
        }
        return repository.save(concession);
    }

    @DeleteMapping("/deleteConcession")
    public String deleteConcession(@RequestParam String id){
        Optional<Concession> concess = repository.findById(id);
        if(!concess.isPresent()){
            throw new CustomException("Concession pas trouvé");
        }
        repository.delete(concess.get());
        return "Successful delete !";
    }



}
