package Item;

import Vaisseaux.Vaisseau;

public class BouclierThermique implements Items {

    public void utiliser(Vaisseau vaisseau) {
      vaisseau.setNbBouclierThermique(vaisseau.getNbBouclierThermique()+1);}
}
