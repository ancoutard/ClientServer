package fr.iut.janviercoutardconcession.model;

import org.springframework.data.annotation.Id;
import java.util.*;

public class ConcessionAggregate {
    @Id
    public Employe employe;

    public List<VoitureVendue> voitures_vendues;

    public int total_nb_voitures_vendues;

    public ConcessionAggregate() {}

    public ConcessionAggregate(Employe employe, List<VoitureVendue> voitures_vendues, int total_nb_voitures_vendues) {
        this.employe = employe;
        this.voitures_vendues = voitures_vendues;
        this.total_nb_voitures_vendues = total_nb_voitures_vendues;
    }
}