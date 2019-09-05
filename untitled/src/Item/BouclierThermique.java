package Item;

import Vaisseaux.Vaisseau;

public class BouclierThermique implements Items {

    private String nom = "Bouclier_Thermique";

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.addNbBouclierThermique(1);
        System.out.println("Vous avez maintenant " + vaisseau.getNbBouclierThermique() + " épaisseurs de bouclier thermique");
    }

    public String getNom() {
        return nom;
    }
}
