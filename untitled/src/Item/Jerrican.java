package Item;

import Vaisseaux.Vaisseau;

public class Jerrican implements Items {

    private String nom="Jerrican";

    public void utiliser(Vaisseau vaisseau) {
        vaisseau.addCarburant(1000);
        System.out.println("Vos réserves de carburant sont maintenant de " + vaisseau.getCarburant() + " Litres");
    }

    public String getNom() {
        return nom;
    }
}
