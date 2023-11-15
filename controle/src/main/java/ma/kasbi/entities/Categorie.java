package ma.kasbi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	@ManyToOne
	private Categorie categoriePere;

public Categorie() {
	super();
}



public Categorie(long id, String nom,  Categorie categoriePere) {
	super();
	this.id = id;
	this.nom = nom;
	
	this.categoriePere = categoriePere;
}



public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Categorie getCategoriePere() {
	return categoriePere;
}

public void setCategoriePere(Categorie categoriePere) {
	this.categoriePere = categoriePere;
}




}

