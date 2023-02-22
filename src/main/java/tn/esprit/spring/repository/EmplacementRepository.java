package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Emplacement;

@Repository
public interface EmplacementRepository extends JpaRepository<Emplacement, Integer> {
}