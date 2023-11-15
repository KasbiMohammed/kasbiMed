package ma.kasbi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ma.kasbi.dao.IDao;
import ma.kasbi.entities.Categorie;

import ma.kasbi.repository.CategorieRepository;

@Service
public class CategorieService implements IDao<Categorie> {
    @Autowired
    CategorieRepository CategorieRepository;

    @Override
    public Categorie create(Categorie o) {
        return CategorieRepository.save(o);
    }

    @Override
    public List<Categorie> findAll() {
        return CategorieRepository.findAll();
    }

    @Override
    public Categorie update(Categorie o) {
        return CategorieRepository.save(o);
    }

    @Override
    public boolean delete(Categorie o) {
        try {
            CategorieRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Categorie findById(Long id) {
        return CategorieRepository.findById(id).orElse(null);
    }
    
  
    
}
