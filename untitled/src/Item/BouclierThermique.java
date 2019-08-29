package Item;

import Vaisseaux.Vaisseau;

public class BouclierThermique implements Items {

    private String nom="Bouclier Thermique";

    public void utiliser(Vaisseau vaisseau) {
      vaisseau.addNbBouclierThermique(1);}

    public String getNom() {
        return nom;
    }
}
