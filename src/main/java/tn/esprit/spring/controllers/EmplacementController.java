package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Emplacement;
import tn.esprit.spring.service.EmplacementService;

import java.util.List;

@RestController
@RequestMapping("/emplacements")
public class EmplacementController {

    @Autowired
    private EmplacementService emplacementService;

    @GetMapping
    public List<Emplacement> getAllEmplacements() {
        return emplacementService.getAllEmplacements();
    }

    @PostMapping
    public ResponseEntity<Void> addEmplacement(@RequestBody Emplacement emplacement) {
        emplacementService.addEmplacement(emplacement);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateEmplacement(@PathVariable int id, @RequestBody Emplacement emplacement) {
        emplacementService.updateEmplacement(id, emplacement);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmplacement(@PathVariable int id) {
        emplacementService.deleteEmplacement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
