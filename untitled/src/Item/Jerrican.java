package Item;

import Vaisseaux.Vaisseau;

public class Jerrican implements Items {

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.addCarburant(100);
    }
}
