package test;

import java.util.ArrayList;
import java.util.List;

import metier.Client;

public class Test {

	public static void main(String[] args) {
		List<String> listeJeu = new ArrayList();
		listeJeu.add("Pokemon");
		listeJeu.add("Mario");
		listeJeu.add("Dofus");
		
		Client client = new Client("Dupont", "Jean", listeJeu);

	}

}
