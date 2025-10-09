package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		
		Hybride hybride = new Hybride("Switch", 300.0, LocalDate.now());
		Portable portable = new Portable("Steam Deck", 550.0, LocalDate.now());
		Salon salon = new Salon("PS5", 450.0, LocalDate.now());
		
		Jeu jeu = new Jeu("Mario Kart", hybride);
		
		Client client = new Client("John", "Doe");
		Client client2 = new Client("Jane", "Doe");
		Adresse adresse = new Adresse(10, "Avenue des Lilas", "Paris");
		
		Boutique boutique = new Boutique("Alerte Hit", adresse);
		
		List<Jeu> achatsClients = new ArrayList<>();
        
		client.addAchat(jeu);
		System.out.println(client.toString());
		
		System.out.println("Test réussi");
		
		//samson
		Adresse adresssam = new Adresse(2, "rue de l'abbe pierre", "sein et marne");
		Boutique boutiquesamson = new Boutique("x", adresssam);
		
		
		
	}
	
	
	
	
	// class Boutique au lieu de class boutique
	// Dans boutique, remplacer String adresse par Adresse adresse

}
