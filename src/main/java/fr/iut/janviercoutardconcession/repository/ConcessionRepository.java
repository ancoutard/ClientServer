package fr.iut.janviercoutardconcession.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.iut.janviercoutardconcession.model.*;
import java.util.*;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Aggregation;

public interface ConcessionRepository extends MongoRepository<Concession, String> {  
  @Query("{ 'nom' : ?0 }")
  List<Concession> findByTheConcessionName(String name);

  @Aggregation({  "{$unwind : \"$employes\"}",  "{$group:{ \"_id\":\"$employes\", \"voitures_vendues\": {$first: \"$employes.voitures_vendu\"}}}",  "{$project : {\"total_nb_voitures_vendues\":{$size : \"$voitures_vendues\"}, voitures_vendues : 1}}"})
  List<ConcessionAggregate> findAllVoituresVenduesByEmployes();
}
