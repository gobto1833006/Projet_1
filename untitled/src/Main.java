import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String choix;
        boolean loop = true;

        System.out.println("Bienvenue dans Space Explorer, le jeu d'exploration de l'espace \n\nQue désirez vous faire ?\n 1-Vérifier le vaisseau\n 2-Explorer une planète\n 3-Utiliser un objet de l'inventaire\n 4-Revenir en arrière");
        while (loop == true) {
            choix = scanner.next();
            if (choix.length() != 1 || !(choix.charAt(0) > 48 && choix.charAt(0) < 53)) {
                System.out.println("Entrée invalide, veuillez réessayer");
            } else {
                switch (choix) {

                    case ("1"):
                        System.out.println("oui");
                        break;
                    case ("2"):

                        break;

                    case ("3"):

                        break;

                    case ("4"):
                }
            }
        }
    }
}
