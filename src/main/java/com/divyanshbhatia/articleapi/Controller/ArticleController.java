package com.divyanshbhatia.articleapi.Controller;

import com.divyanshbhatia.articleapi.Article;
import com.divyanshbhatia.articleapi.Repository.ArticleRepository;
import com.divyanshbhatia.articleapi.Repository.ArticleRepositoryImpl;
import com.divyanshbhatia.articleapi.Service.ArticleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    private final ArticleRepository articleRepo;

    public ArticleController(ArticleRepositoryImpl repository) {
        this.articleRepo = repository;
    }

    @GetMapping("/articles/{id}")
    public Article getArticle(@PathVariable Long id) {
        return articleRepo.findArticleById(id);
    }

    @PostMapping("/articles")
    public void publishArticle(@RequestBody Article newArticle) {
        articleRepo.saveArticle(newArticle);
    }

    @GetMapping("/articles")
    public List<Article> retrieveAllArticles() {
        return articleRepo.findAllArticles();
    }

    @PutMapping("/articles/{id}")
    public void replaceArticle(@RequestBody Article newArticle, @PathVariable Long id) {
        articleRepo.replaceArticleById(newArticle, id);
    }

    @DeleteMapping("/articles/{id}")
    public void deleteArticle(@PathVariable Long id) {
        articleRepo.deleteArticleById(id);
    }

}
