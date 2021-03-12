package metier;

import java.util.ArrayList;
import java.util.List;

public class Boutique {
	
	private String nom;
	private Adresse adresse;
	private List<String> listeDeJeu;

	public Boutique() {
	}

	public Boutique(String nom, Adresse adresse, List<String> listeDeJeu) {
		this.nom = nom;
		this.adresse = adresse;
		this.listeDeJeu = listeDeJeu;
	}
	
	public Boutique(String nom, Adresse adresse) {
		this.nom = nom;
		this.adresse = adresse;
		this.listeDeJeu = new ArrayList<String>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<String> getListeDeJeu() {
		return listeDeJeu;
	}

	public void setListeDeJeu(List<String> listeDeJeu) {
		this.listeDeJeu = listeDeJeu;
	}
	
	
}
