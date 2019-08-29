package Item;

import Vaisseaux.Vaisseau;

public class Bombe implements Items {

    private String nom="Bombe";

    public void utiliser(Vaisseau vaisseau) {
       vaisseau.fonctionDamage(100);
    }

    public String getNom() {
        return nom;
    }
}
