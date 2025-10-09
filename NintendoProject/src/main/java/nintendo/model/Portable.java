package nintendo.model;
import java.time.LocalDate;

public class Portable extends Console {

    public Portable(String nom, double prix, LocalDate ddsortie) {
        super(nom, prix, ddsortie);
    }

    @Override
    public String toString() {
        return "Console Portable [nom=" + getNom() + ", prix=" + getPrix() + ", ddsortie=" + getDdsortie() + "]";
    }
}
