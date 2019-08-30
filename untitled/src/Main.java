import Planete.*;
import Vaisseaux.Vaisseau;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String choix;
        boolean loop = true;
        Vaisseau vaisseau = new Vaisseau();
        vaisseau.addJournalDeBord(new Terre());
        Planetes[] poolPlanetes ={new Lune(),new Mars(),new Mercure(),new Terre(),new Venus()};


        System.out.println("Bienvenue dans Space Explorer, le jeu d'exploration de l'espace \n\nQue désirez vous faire ?\n 1-Vérifier le vaisseau\n 2-Explorer une planète\n 3-Utiliser un objet de l'inventaire\n 4-Revenir en arrière");
        while (loop == true) {
            choix = scanner.next();
            if (choix.length() != 1 || !(choix.charAt(0) > 48 && choix.charAt(0) < 53)) {
                System.out.println("Entrée invalide, veuillez réessayer");
            } else {
                switch (choix) {

                    case ("1"):
                        EtatVaisseau(vaisseau);

                        break;
                    case ("2"):
                        int nextPlanet = (int)(Math.random()*5);
                        poolPlanetes[nextPlanet].explorer(vaisseau);
                        vaisseau.addJournalDeBord(poolPlanetes[nextPlanet]);

                        break;

                    case ("3"):
                        System.out.println("Quel objet souhaitez vous utiliser?");

                        break;

                    case ("4"):
                }
            }
        }
    }

    public static void EtatVaisseau(Vaisseau vaisseau) {
        System.out.println("État du vaisseau :\n Point de vie :" + vaisseau.getPointDeVie());
        if (vaisseau.getPointBouclier() != 0) {
            System.out.println(" Protection bouclier :" + vaisseau.getPointBouclier());
        }
        System.out.println(" Quantité de carburant :" + vaisseau.getCarburant());
        if (vaisseau.getNbBouclierThermique() != 0) {
            System.out.println(" Épaisseurs de protection thermique :" + vaisseau.getNbBouclierThermique());
        }
//System.out.println("Planète Courante");
        vaisseau.imprimerInventaire();


    }
}

