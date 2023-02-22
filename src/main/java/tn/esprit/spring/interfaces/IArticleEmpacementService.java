package tn.esprit.spring.interfaces;



        import tn.esprit.spring.entities.Emplacement;

        import java.util.List;
        import java.util.Optional;

public interface IArticleEmpacementService {
    List<Emplacement> getAllArticleEmplacements();
    Optional<Emplacement> getArticleEmplacementById(Long idAssocAE);
    Emplacement saveArticleEmplacement(Emplacement Emplacement);
    void deleteEmplacementById(Long idAssocAE);
}
