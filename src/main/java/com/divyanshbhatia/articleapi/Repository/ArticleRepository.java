package com.divyanshbhatia.articleapi.Repository;

import com.divyanshbhatia.articleapi.Article;

import java.util.List;

public interface ArticleRepository<T> {
    public void saveArticle(T t);
    public Article findArticleById(Long id);
    public List<Article> findAllArticles();
    public void replaceArticleById(T t, Long id);
    public void deleteArticleById(Long id);
}
