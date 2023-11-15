package ma.kasbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.kasbi.entities.Categorie;
@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
