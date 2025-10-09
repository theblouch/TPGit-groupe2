package nintendo.model;
import java.time.LocalDate;

public class Hybride extends Console {

    public Hybride(String nom, double prix, LocalDate ddsortie) {
        super(nom, prix, ddsortie);
    }

    @Override
    public String toString() {
        return "Console Hybride [nom=" + getNom() + ", prix=" + getPrix() + ", ddsortie=" + getDdsortie() + "]";
    }
}
