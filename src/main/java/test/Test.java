package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import metier.Adresse;
import metier.Boutique;

import metier.Achat;
import metier.Client;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Adresse a1 = new Adresse(5,"rue","ville");
		Console c1= new Console("ps4", 10, null);
		Console c2= new Console("xbox", 15, null);
		Boutique b1 = new Boutique("micro",a1);
		
		
		List <Console> consoles = new ArrayList();
		
		Jeu j1 = new Jeu("mario", consoles,b1);
		Jeu j2 = new Jeu("skyrim", consoles,b1);
		Jeu j3 = new Jeu("pokemon", consoles,b1);
		Jeu j4 = new Jeu("zelda", consoles,b1);
		Jeu j5 = new Jeu("tetris", consoles,b1);
		
		List<Achat> achats = new ArrayList();
		achats.add(new Achat(j1, "2018-10-20", 10.0));
		achats.add(new Achat(j2, "2018-10-15", 30.0));
		achats.add(new Achat(j3, "2018-12-24", 25.0));
		
		Client client = new Client("Dupont", "Karim", achats);
		
	

	}

}
