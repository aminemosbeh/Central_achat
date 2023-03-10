package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.ArticleEmplacement;

@Repository
public interface ArticleEmplacementRepository extends JpaRepository<ArticleEmplacement, Long> {
}
