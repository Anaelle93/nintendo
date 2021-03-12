package metier;

import java.time.LocalDate;

public class Achat {
 private String jeu;
 private LocalDate date;
 private double prix;
 
public Achat(String jeu, LocalDate date, double prix) {
	this.jeu = jeu;
	this.date = date;
	this.prix = prix;
}

public String getJeu() {
	return jeu;
}

public void setJeu(String jeu) {
	this.jeu = jeu;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}
 
 
 
}
