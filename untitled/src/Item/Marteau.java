package Item;

import Vaisseaux.Vaisseau;

public class Marteau implements Items {

    public void utiliser(Vaisseau vaisseau) {
       vaisseau.setPointDeVie(vaisseau.getPointDeVie() + 20);
       if (vaisseau.getPointDeVie()>vaisseau.getPointVieMax()){
           vaisseau.setPointDeVie(vaisseau.getPointVieMax());
       }
    }
}


