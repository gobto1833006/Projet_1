package Item;

import Vaisseaux.Vaisseau;

public class Bombe implements Items {

    private String nom="Bombe";

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.fonctionDamage(100);
        System.out.println("Vous vous exploser vous-même. Qui voudrait bien utiliser une bombe dans un vaisseau? Vous avez maintenant " + vaisseau.getPointDeVie() +" point de vie");
    }

    public String getNom() {
        return nom;
    }
}
