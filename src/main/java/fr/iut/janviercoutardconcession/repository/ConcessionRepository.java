package fr.iut.janviercoutardconcession.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.iut.janviercoutardconcession.model.*;

public interface ConcessionRepository extends MongoRepository<Concession, String> {  
    
}
