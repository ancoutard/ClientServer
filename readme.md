<!-- # Squelette projet Client/Serveur


## Installation

Si vous n'avez pas d'IDE préféré, vous pouvez prendre IntelliJ => [Download Page](https://www.jetbrains.com/fr-fr/idea/download/#section=windows)

## Fork

Commencer par renommer le projet avec vos deux ou trois noms à minima. Vous pouvez l'appeler nom1-nom2-nom-de-votre-projet ou juste nom1-nom2 si vous n'êtes vraiment pas inspirés.
Tant qu'il y a vos noms tout ira bien ;)

Si vous n'êtes pas familier avec Maven, dans le fichier pom.xml à la racine du projet il y'a deux balises (artifactId et description) que vous devez changer pour nommer le projet comme vous le souhaitez.

## Documentation utile

On commence par un peu de culture pour ceux qui sont intéressés à en apprendre plus sur [Maven](https://maven.apache.org/what-is-maven.html)

#### SpringBoot MongoDB

Méthodes de base déjà présentes dans vos repo qui implémentent l'interface __MongoRepository__:

```java
  S save(S entity);

  Optional<T> findById(ID primaryKey);

  Iterable<T> findAll();

  long count();

  void delete(T entity);

  boolean existsById(ID primaryKey);

```

[Tableau récapitulatif des mots clefs à utiliser en fonction des requêtes base que vous souhaitez faire](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#mongodb.repositories.queries)

[Comment écrire un pipeline d'agrégation dans votre repo](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#mongodb.repositories.queries.aggregation)


## License
[MIT](https://choosealicense.com/licenses/mit/) -->

# README Projet Client Serveur

La javadoc se situe dans apidocs/index.html

## Nos services

Notre application possède deux "points d'entrée" qui sont les services lié à la concession et à nos clients.
</br>

### Concession :

</br>

On a un CRUD classique.

</br>

D'abord les <strong>GET</strong> :

&nbsp;&nbsp;&nbsp;&nbsp;- /getConcession

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Cela retourne toutes les concessions

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Aucun paramètre

&nbsp;&nbsp;&nbsp;&nbsp;- /getConcessionByName

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Cela retourne les concessions possédant les noms passés en paramètres

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Prend un nom en paramètre

&nbsp;&nbsp;&nbsp;&nbsp;- /getAllVoituresVenduesByEmploye

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Cela retourne le nombres de voitures vendu par employe

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Aucun paramètre

</br>

Puis le <strong>POST</strong> :

&nbsp;&nbsp;&nbsp;&nbsp;- /postConcession

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; => Permet d'ajouter une concession en base

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Prend une concession en paramètre

</br>

Ensuite le <strong>PUT</strong> :

&nbsp;&nbsp;&nbsp;&nbsp;- /putConcession

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; => Modifie une concession

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Prend une concession en paramètre

</br>

Pour finir le <strong>DELETE</strong> :

&nbsp;&nbsp;&nbsp;&nbsp;- /deleteConcession

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; => Supprime une concession

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Prend une concession id en paramètre

</br>
</br>

### Client :

</br>

On a aussi un CRUD classique.

</br>

D'abord les <strong>GET</strong> :

&nbsp;&nbsp;&nbsp;&nbsp;- /getClients

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Aucun paramètre

&nbsp;&nbsp;&nbsp;&nbsp;- /getClientsById

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Prend un id en paramètre

&nbsp;&nbsp;&nbsp;&nbsp;- /getClientsByName

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Prend un nom en paramètre

</br>

Puis le <strong>POST</strong> :

&nbsp;&nbsp;&nbsp;&nbsp;- /postClient

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; => Permet d'ajouter un client en base

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Prend un client en paramètre

</br>

Ensuite le <strong>PUT</strong> :

&nbsp;&nbsp;&nbsp;&nbsp;- /putClient

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; => Modifie un client

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Prend un client en paramètre

</br>

Pour finir le <strong>DELETE</strong> :

&nbsp;&nbsp;&nbsp;&nbsp;- /deleteClient

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; => Supprime un client

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Prend un client id en paramètre
