package Item;

import Vaisseaux.Vaisseau;

public class Bouclier implements Items {

    private String nom="bouclier";

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.addPointBouclier(50);
    }

    public String getNom() {
        return nom;
    }
}
