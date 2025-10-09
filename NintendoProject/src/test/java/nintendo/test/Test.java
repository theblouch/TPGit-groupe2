package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console console = new Console("Switch");
		
		Jeu jeu = new Jeu("Mario Kart", console);
		
		Client client = new Client("John", "Doe");
		Client client2 = new Client("Jane", "Doe");
		Adresse adresse = new Adresse(10, "Avenue des Lilas", "Paris");
		
		Boutique boutique = new Boutique("Alerte Hit", adresse);
		
		System.out.println("Test réussi");
		
		//samson
		Adresse adresssam = new Adresse(2, "rue de l'abbe pierre", "sein et marne");
		Boutique boutiquesamson = new Boutique("x", adresssam);
		
		
		
	}
	
	
	
	
	// class Boutique au lieu de class boutique
	// Dans boutique, remplacer String adresse par Adresse adresse

}
