package nintendo.model;
import java.time.LocalDate;

public class Salon extends Console {

    public Salon(String nom, double prix, LocalDate ddsortie) {
        super(nom, prix, ddsortie);
    }

    @Override
    public String toString() {
        return "Console de Salon [nom=" + getNom() + ", prix=" + getPrix() + ", ddsortie=" + getDdsortie() + "]";
    }
}
