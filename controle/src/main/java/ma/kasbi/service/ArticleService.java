package ma.kasbi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ma.kasbi.dao.IDao;
import ma.kasbi.entities.Article;

import ma.kasbi.repository.ArticleRepository;

@Service
public class ArticleService implements IDao<Article> {
    @Autowired
    ArticleRepository ArticleRepository;

    @Override
    public Article create(Article o) {
        return ArticleRepository.save(o);
    }

    @Override
    public List<Article> findAll() {
        return ArticleRepository.findAll();
    }

    @Override
    public Article update(Article o) {
        return ArticleRepository.save(o);
    }

    @Override
    public boolean delete(Article article) {
        try {
            ArticleRepository.delete(article);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Article findById(Long id) {
        return ArticleRepository.findById(id).orElse(null);
    }
    

    
}
