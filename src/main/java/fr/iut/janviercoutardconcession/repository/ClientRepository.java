package fr.iut.janviercoutardconcession.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.iut.janviercoutardconcession.model.*;
import java.util.*;
import org.springframework.data.mongodb.repository.Query;

public interface ClientRepository extends MongoRepository<Client, String> {  
  @Query("{ 'prenom' : ?0 }")
  List<Client> findByTheClientFirstname(String firstname);

}
