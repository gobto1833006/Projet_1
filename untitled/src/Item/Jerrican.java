package Item;

import Vaisseaux.Vaisseau;

public class Jerrican implements Items {

    private String nom="Jerrican";

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.addCarburant(100);
    }

    public String getNom() {
        return nom;
    }
}
