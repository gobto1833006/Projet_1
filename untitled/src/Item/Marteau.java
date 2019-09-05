package Item;

import Vaisseaux.Vaisseau;

public class Marteau implements Items {

    private String nom = "Marteau";

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.addPointDeVie(20);
        if (vaisseau.getPointDeVie() > vaisseau.getPointVieMax()) {
            vaisseau.addPointDeVie(vaisseau.getPointVieMax());

        }
        System.out.println("Vous utilisez le marteau pour réparer votre vaisseau. Le vaisseau a maintenant +" + vaisseau.getPointDeVie() + " points de vie");
    }

    public String getNom() {
        return nom;
    }
}


