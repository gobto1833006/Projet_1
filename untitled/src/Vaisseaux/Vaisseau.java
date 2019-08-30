package Vaisseaux;

import Item.Items;
import Planete.Planetes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Vaisseau {

    private int carburant;
    private int pointDeVie;
    private int pointVieMax=100;
    private int pointBouclier=0;
    private ArrayList<Items> inventaire=new ArrayList<Items>();
    private int nbBouclierThermique=0;
    private LinkedList<Planetes> journalDeBord=new LinkedList<Planetes>();

    public void fonctionDamage(int damage){
        if (pointBouclier !=0 && pointBouclier>damage){
            pointBouclier-=damage;
        }
        else {
            damage-=pointBouclier;
            pointDeVie-=damage;
        }
        if (pointDeVie<=0){
            System.out.println("Votre vaisseau est mort");
        }
    }

    public int getCarburant() {
        return carburant;
    }

    public void addCarburant(int carburant) {
        this.carburant += carburant;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void addPointDeVie(int pointDeVie) {
        this.pointDeVie += pointDeVie;
    }

    public ArrayList<Items> getInventaire() {
        return inventaire;
    }

    public void addInventaire(Items items) {
        inventaire.add(items);
    }

    public int getPointVieMax() {
        return pointVieMax;
    }

    public void setPointVieMax(int pointVieMax) {
        this.pointVieMax = pointVieMax;
    }

    public int getPointBouclier() {
        return pointBouclier;
    }

    public void addPointBouclier(int pointBouclier) {
        this.pointBouclier += pointBouclier;
    }

    public int getNbBouclierThermique() {
        return nbBouclierThermique;
    }

    public void addNbBouclierThermique(int nbBouclierThermique) {
        this.nbBouclierThermique += nbBouclierThermique;
    }

    public int lastPlanetOrder(){return journalDeBord.peek().getOrdre();}

    public void addJournalDeBord(Planetes planetes){
        journalDeBord.addLast(planetes);
    }


    public void imprimerInventaire(){
        System.out.print("Inventaire :");
        for (int i=0;i<inventaire.size();i++){
            System.out.print(inventaire.get(i).getNom() + ", ");
        }
    }
    public void imprimerInventaireChoix(){
        for (int i=0;i<inventaire.size();i++){
            System.out.println(i + "-" + inventaire.get(i).getNom());
        }
    }
}
