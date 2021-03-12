package test;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Adresse a1 = new Adresse(5,"rue","ville");
		Console c1= new Console("ps4");
		Console c2= new Console("xbox");
		Boutique b1 = new Boutique("micro",a1);
		
		
		List <Console> consoles = new ArrayList();
		
		Jeu j1 = new Jeu("mario", consoles,b1);
		Jeu j2 = new Jeu("skyrim", consoles,b1);
		Jeu j3 = new Jeu("pokemon", consoles,b1);
		Jeu j4 = new Jeu("zelda", consoles,b1);
		Jeu j5 = new Jeu("tetris", consoles,b1);
		
	

	}

}
