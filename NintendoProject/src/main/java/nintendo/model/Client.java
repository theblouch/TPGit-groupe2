package nintendo.model;

import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Jeu> listeAchats;
	
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
