package Planete;

import Item.*;
import Vaisseaux.Vaisseau;

public abstract class Planetes {

    private boolean atmosphere;
    private String nom;
    private int chanceCombat;
    private int chanceItem;
    private int ordre;
    private Items[] poolItem = {new Bombe(), new Bouclier(), new BouclierThermique(), new Jerrican(), new Marteau()};


    public Planetes(boolean atmosphere, String nom, int chanceCombat, int chanceItem, int ordre) {
        this.atmosphere = atmosphere;
        this.nom = nom;
        this.chanceCombat = chanceCombat;
        this.chanceItem = chanceItem;
        this.ordre = ordre;
    }

    public void explorer(Vaisseau vaisseau) {
        System.out.println("Vous visitez la planète " + nom + ".");
        System.out.println("Vous dépensez " + (Math.abs(ordre - vaisseau.lastPlanetOrder())) * 100 + " points de carburant");
        if (atmosphere) {
            if (vaisseau.getNbBouclierThermique() != 0) {
                vaisseau.addNbBouclierThermique(-1);
                System.out.println(
                        "À l'entrée dans l'atmosphère, vous perdez un bouclier thermique. Il vous reste maintenant " + vaisseau.getNbBouclierThermique() + "bouclier thermique équipé");
            } else {
                int pointDeVieAvant = vaisseau.getPointDeVie();
                vaisseau.addPointDeVie(-((int) (Math.random() * 5 + 5)));
                System.out.println("A l'entrée de l'atmosphère, votre vaisseau prend feu, vous faisant perdre " + (pointDeVieAvant - vaisseau.getPointDeVie()) + " points de vie. Vous avez maintenant " + vaisseau.getPointDeVie() + " point de vie");
            }
        }
        if (Math.random() * chanceCombat < 1) {

            if (!(vaisseau.getInventaire().contains(new Bombe()))) {
                int pointDeVieAvant = vaisseau.getPointDeVie();
                vaisseau.addPointDeVie((int) (Math.random() * 10 + 5));
                System.out.println("Des pirates vous attaque! Vous perdez " + Math.abs(pointDeVieAvant - vaisseau.getPointDeVie()) + " point de vie. Il vous reste maintenant " + vaisseau.getPointDeVie() + " point de vie"));
            } else {
                System.out.println("Des pirates vous attaque! Heureusement, votre bombe dans votre inventaire les intimide et ils ne vous attaquent pas. Il n'ont pas l'air de savoir que la bombe a été designé pour exploser votre vaisseau et non pas pour vous défendre");
            }
        }
        while (Math.random() * chanceItem < 5) {
            vaisseau.addInventaire(poolItem[(int)(Math.random()*5)]);
            System.out.println("Vous obtenez un "+ vaisseau.getInventaire().get(vaisseau.getInventaire().size()-1).getNom() + "!");
        }


    }

    public int getOrdre() {
        return ordre;
    }
}
