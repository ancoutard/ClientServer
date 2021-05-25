package fr.iut.janviercoutardconcession.controller;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.*;
import fr.iut.janviercoutardconcession.model.*;
import fr.iut.janviercoutardconcession.repository.*;

import java.util.List;

/**
 * Les Controller vont vous permettre une exposition rapide vos {@link org.springframework.data.mongodb.repository.MongoRepository}
 * et une mise en situation de leurs cas d'usages.
 */
@RestController
public class ConcessionController {

    final ConcessionRepository repository;


    /**
     * Spring fonctionne avec de l'injection de dépendances, pas d'annotation à rajouter dans les controller,
     * pas de new, il va s'en charger pour vous grâce à l'annotation présente sur cette classe.
     */
    public ConcessionController(ConcessionRepository repository) { // Il vous faut une implem à vous pour que ça compile
        this.repository = repository;
    }

    @GetMapping("/getEntity")
    public List<Concession> list(@RequestParam(required = false) String name) {
        return repository.findAll();
    }

    @PostMapping("/postEntity")
    public Concession insert(@RequestBody Concession entity) {
        if (entity == null) {
            throw new CustomException("Must be not null");
        }
        return repository.save(entity);
    }

}
