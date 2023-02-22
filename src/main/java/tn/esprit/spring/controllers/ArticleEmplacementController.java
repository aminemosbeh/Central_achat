package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.ArticleEmplacement;
import tn.esprit.spring.service.ArticleEmplacementService;

import java.util.List;

@RestController
@RequestMapping("/articleEmplacements")
public class ArticleEmplacementController {

    @Autowired
    private ArticleEmplacementService articleEmplacementService;

    @GetMapping
    public List<ArticleEmplacement> getAllArticleEmplacements() {
        return articleEmplacementService.getAllArticleEmplacements();
    }

    @PostMapping
    public void addArticleEmplacement(@RequestBody ArticleEmplacement articleEmplacement) {
        articleEmplacementService.addArticleEmplacement(articleEmplacement);
    }

    @PutMapping("/{id}")
    public void updateArticleEmplacement(@PathVariable int id, @RequestBody ArticleEmplacement articleEmplacement) {
        articleEmplacementService.updateArticleEmplacement(id, articleEmplacement);
    }

    @DeleteMapping("/{id}")
    public void deleteArticleEmplacement(@PathVariable int id) {
        articleEmplacementService.deleteArticleEmplacement(id);
    }
}