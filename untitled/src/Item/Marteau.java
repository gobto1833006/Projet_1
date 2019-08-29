package Item;

import Vaisseaux.Vaisseau;

public class Marteau implements Items {

    private String nom="Marteau";

    public void utiliser(Vaisseau vaisseau) {
       vaisseau.addPointDeVie(20);
       if (vaisseau.getPointDeVie()>vaisseau.getPointVieMax()){
           vaisseau.addPointDeVie(vaisseau.getPointVieMax());
       }
    }

    public String getNom() {
        return nom;
    }
}


