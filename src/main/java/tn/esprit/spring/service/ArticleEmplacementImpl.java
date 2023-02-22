package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.ArticleEmplacement;
import tn.esprit.spring.repository.ArticleEmplacementRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleEmplacementImpl implements ArticleEmplacementService {

        @Autowired
        private ArticleEmplacementRepository articleEmplacementRepository;

        @Override
        public List<ArticleEmplacement> getAllArticleEmplacements() {
            List<ArticleEmplacement> articleEmplacements = new ArrayList<>();
            articleEmplacementRepository.findAll().forEach(articleEmplacements::add);
            return articleEmplacements;
        }

        @Override
        public void addArticleEmplacement(ArticleEmplacement articleEmplacement) {
            articleEmplacementRepository.save(articleEmplacement);
        }

        @Override
        public void updateArticleEmplacement(int id, ArticleEmplacement articleEmplacement) {
            Optional<ArticleEmplacement> optionalArticleEmplacement = articleEmplacementRepository.findById((long) id);
            if (optionalArticleEmplacement.isPresent()) {
                ArticleEmplacement existingArticleEmplacement = optionalArticleEmplacement.get();
                existingArticleEmplacement.setStockE(articleEmplacement.getStockE());
                articleEmplacementRepository.save(existingArticleEmplacement);
            }
        }

        @Override
        public void deleteArticleEmplacement(int id) {
            articleEmplacementRepository.deleteById((long) id);
        }
}