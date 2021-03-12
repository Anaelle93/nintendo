package metier;

import java.time.LocalDate;

public class Achat {
 private Jeu jeu;
 private String date;
 private double prix;
 
public Achat(Jeu jeu, String date, double prix) {
	this.jeu = jeu;
	this.date = date;
	this.prix = prix;
}

public Jeu getJeu() {
	return jeu;
}

public void setJeu(Jeu jeu) {
	this.jeu = jeu;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}
 
 
 
}
