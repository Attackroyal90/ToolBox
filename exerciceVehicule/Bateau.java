package exerciceVehicule;

public class Bateau extends Vehicule{

    private double longueur;

    public Bateau(String marque, int vitesseMax, double longueur) {
        super(vitesseMax, marque);
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return "Bateau{" + super.toString()+
                "longueur=" + longueur +
                '}';
    }
}
