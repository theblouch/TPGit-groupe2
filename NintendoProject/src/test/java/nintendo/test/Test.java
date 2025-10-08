package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;
import nintendo.model.boutique;

public class Test {

	public static void main(String[] args) {
		
		Console console = new Console("Switch");
		
		Jeu jeu = new Jeu("Mario Kart", console);
		
		Client client = new Client("John", "Doe");
				
		Adresse adresse = new Adresse(10, "Avenue des Lilas", "Paris");
		
		boutique boutique = new boutique("Alerte Hit", "Avenue des Lilas");
		
	}
	
	// class Boutique au lieu de class boutique
	// Dans boutique, remplacer String adresse par Adresse adresse

}
