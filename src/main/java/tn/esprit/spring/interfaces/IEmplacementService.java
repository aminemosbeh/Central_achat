package tn.esprit.spring.interfaces;

import tn.esprit.spring.entities.Emplacement;

import java.util.List;

public interface IEmplacementService {
    List<Emplacement> retrieveAllEmplacement();

    Emplacement addEmplacement (Emplacement em);

    Emplacement updateEmplacement (Emplacement em);


    Emplacement retrieveEmplacement(Integer idEmplacement);

    List<Emplacement> retrieveEmplacementByContractSpecJPQL();
    List<Emplacement> retrieveEmplacementByContractSpecSQL();
    Emplacement removeEmplacement(Integer idEmplacement);

}
