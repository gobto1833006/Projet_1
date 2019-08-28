package Item;

import Vaisseaux.Vaisseau;

public class Marteau implements Items {

    public void utiliser(Vaisseau vaisseau) {
       vaisseau.addPointDeVie(20);
       if (vaisseau.getPointDeVie()>vaisseau.getPointVieMax()){
           vaisseau.addPointDeVie(vaisseau.getPointVieMax());
       }
    }
}


