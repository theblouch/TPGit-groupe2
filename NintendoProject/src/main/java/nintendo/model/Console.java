package nintendo.model;
import java.time.LocalDate;

public abstract class Console {

    private String nom;
    private double prix;
    private LocalDate ddsortie;

    public Console(String nom) {
        this.nom = nom;
    }

    public Console(String nom, double prix, LocalDate ddsortie) {
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
