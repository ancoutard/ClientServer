package fr.iut.janviercoutardconcession.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.iut.janviercoutardconcession.model.*;
import java.util.*;
import org.springframework.data.mongodb.repository.Query;

public interface ConcessionRepository extends MongoRepository<Concession, String> {  
  @Query("{ 'nom' : ?0 }")
  List<Concession> findByTheConcessionName(String name);
}
