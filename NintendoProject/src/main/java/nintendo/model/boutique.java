package nintendo.model;

public class boutique {
	private String nom; 
	private String adresse;
	public boutique(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "boutique [nom=" + nom + ", adresse=" + adresse + "]";
	} 
	

}
