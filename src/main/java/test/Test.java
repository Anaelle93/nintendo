package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Achat;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c1= new Console("ps4");
		Console c2= new Console("xbox");
		List <Console> consoles = new ArrayList();
		
		Jeu j1 = new Jeu("mario", consoles);
		Jeu j2 = new Jeu("skyrim", consoles);
		Jeu j3 = new Jeu("pokemon", consoles);
		Jeu j4 = new Jeu("zelda", consoles);
		Jeu j5 = new Jeu("tetris", consoles);
		
		List<Achat> achats = new ArrayList();
		achats.add(new Achat(j1, "2018-10-20", 10.0));
		achats.add(new Achat(j2, "2018-10-15", 30.0));
		achats.add(new Achat(j3, "2018-12-24", 25.0));
		
		Client client = new Client("Dupont", "Karim", achats);
		
	

	}

}
