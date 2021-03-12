package test;

import java.util.ArrayList;
import java.util.List;

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
		
	

	}

}
