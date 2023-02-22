package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Emplacement;
import tn.esprit.spring.repository.EmplacementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmplacementImpl implements EmplacementService {

    @Autowired
    private EmplacementRepository emplacementRepository;

    @Override
    public List<Emplacement> getAllEmplacements() {
        return emplacementRepository.findAll();
    }

    @Override
    public Emplacement getEmplacementById(int id) {
        Optional<Emplacement> optionalEmplacement = emplacementRepository.findById(id);
        return optionalEmplacement.orElse(null);
    }

    @Override
    public Emplacement addEmplacement(Emplacement emplacement) {
        return emplacementRepository.save(emplacement);
    }

    @Override
    public Emplacement updateEmplacement(int id, Emplacement emplacement) {
        Optional<Emplacement> optionalEmplacement = emplacementRepository.findById(id);
        if (optionalEmplacement.isPresent()) {
            Emplacement existingEmplacement = optionalEmplacement.get();
            existingEmplacement.setNomEmplacement(emplacement.getNomEmplacement());
            existingEmplacement.setAdresseEmplacement(emplacement.getAdresseEmplacement());
            existingEmplacement.setGouvernorat(emplacement.getGouvernorat());
            return emplacementRepository.save(existingEmplacement);
        }
        return null;
    }

    @Override
    public void deleteEmplacement(int id) {
        emplacementRepository.deleteById(id);
    }
}
