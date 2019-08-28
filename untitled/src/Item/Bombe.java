package Item;

import Vaisseaux.Vaisseau;

public class Bombe implements Items {
    public void utiliser(Vaisseau vaisseau) {
       vaisseau.fonctionDamage(100);
    }
}
