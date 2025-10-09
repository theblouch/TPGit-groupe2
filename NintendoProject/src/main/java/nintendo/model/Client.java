package nintendo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Jeu> listeAchats = new ArrayList<>();
	
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Client(String nom, String prenom, List<Jeu> listeAchats) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchats = listeAchats;
	}



	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Jeu> getListeAchats() {
		return listeAchats;
	}
	public void setListeAchats(List<Jeu> listeAchats) {
		this.listeAchats = listeAchats;
	}

	
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeAchats=" + listeAchats + "]";
	}

	public void addAchat(Jeu jeu) {
		this.listeAchats.add(jeu);
	}
	
}
