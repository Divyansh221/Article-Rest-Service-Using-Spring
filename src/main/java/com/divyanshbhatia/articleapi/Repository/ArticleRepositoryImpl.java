package com.divyanshbhatia.articleapi.Repository;

import com.divyanshbhatia.articleapi.Article;
import com.divyanshbhatia.articleapi.Service.ArticleNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository<Article>{
    private Map<Long, Article> repository;

    public ArticleRepositoryImpl() {
        this.repository = new HashMap<>();
    }

    @Override
    public void saveArticle(Article article) {
        repository.put(article.getId(), article);
    }

    @Override
    public Article findArticleById(Long id) {
        if(repository.get(id) == null){
            throw new ArticleNotFoundException(id);
        }
        else return repository.get(id);
    }

    @Override
    public List<Article> findAllArticles() {
        List<Article> articlesList = new ArrayList<>();
        for (Map.Entry<Long, Article> article : repository.entrySet()){
            articlesList.add(article.getValue());
        }
        return articlesList;
    }

    @Override
    public void replaceArticleById(Article article, Long id) {
        findArticleById(id).setFileName(article.getFileName());
        findArticleById(id).setFilePath(article.getFilePath());
        findArticleById(id).setFileContent(article.getFileContent());
    }

    @Override
    public void deleteArticleById(Long id) {
        repository.remove(id);
    }
}
