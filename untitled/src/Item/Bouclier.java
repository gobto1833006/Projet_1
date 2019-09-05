package Item;

import Vaisseaux.Vaisseau;

public class Bouclier implements Items {

    private String nom = "bouclier";

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.addPointBouclier(50);
        System.out.println("votre niveau de bouclier est de " + vaisseau.getPointBouclier() + " point de bouclier");
    }

    public String getNom() {
        return nom;
    }
}
