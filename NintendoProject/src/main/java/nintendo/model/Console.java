package nintendo.model;
import java.time.LocalDate;

public class Console {

	private String nom;
	private double prix;
	private LocalDate ddsortie;
	
	
	public Console(String nom) {
		super();
		this.nom = nom;
	}

	public Console(String nom, double prix, LocalDate ddsortie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.ddsortie = ddsortie;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalDate getDdsortie() {
		return ddsortie;
	}

	public void setDdsortie(LocalDate ddsortie) {
		this.ddsortie = ddsortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", ddsortie=" + ddsortie + "]";
	}
	
	
}
