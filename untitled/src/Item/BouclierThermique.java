package Item;

import Vaisseaux.Vaisseau;

public class BouclierThermique implements Items {

    public void utiliser(Vaisseau vaisseau) {
      vaisseau.addNbBouclierThermique(1);}
}
