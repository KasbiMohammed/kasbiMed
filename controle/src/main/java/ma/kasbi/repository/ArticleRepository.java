package ma.kasbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.kasbi.entities.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}

