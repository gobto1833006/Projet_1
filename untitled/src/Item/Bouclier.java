package Item;

import Vaisseaux.Vaisseau;

public class Bouclier implements Items {

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.addPointBouclier(50);
    }
}
