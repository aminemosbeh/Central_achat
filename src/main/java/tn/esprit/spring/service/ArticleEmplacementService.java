package tn.esprit.spring.service;

import tn.esprit.spring.entities.ArticleEmplacement;

import java.util.List;

public interface ArticleEmplacementService {
    List<ArticleEmplacement> getAllArticleEmplacements();

    void addArticleEmplacement(ArticleEmplacement articleEmplacement);

    void updateArticleEmplacement(int id, ArticleEmplacement articleEmplacement);

    void deleteArticleEmplacement(int id);
}
