package setUp;

import java.util.Scanner;

import joueur.Joueur;
import protagonistes.EtreVivant;
import protagonistes.TypeEtreVivant;
import protagonistes.affichageEtreVivant;
import protagonistes.affichageProtagonistes;
import stockage.StockEtreVivant;
import stockage.stockProtagonisteChoisie;


public class setUp {

    int nbPerso;
    int numJoueur;
    private affichageProtagonistes[][] plateau = new affichageProtagonistes[nbPerso][nbPerso];


    public setUp() {
        Joueur[] tabJoueurs = new Joueur[2];
        affichageEtreVivant affichageChoix = new affichageEtreVivant();
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 2) {
            System.out.println("Entrer votre nom joueur n°" + numJoueur + ": ");
            String nom = scanner.next();
            tabJoueurs[i] = new Joueur(nom, numJoueur);

            System.out.println("Choisir votre camps (exemple : 1) pour Gobelin) :");
            affichageChoix.affichage();
            int camps = scanner.nextInt();

            System.out.println("Combien de personnages voulez-vous ? (1 à 10)");
            nbPerso = scanner.nextInt();

            for (int j = 0; j < nbPerso; j++) {
                System.out.println("Choisir votre protagonsite :");
                affichageProtagonistes.affichageSequenceDeProtagoniste(camps);

                while (numJoueur == 1) {

                    for (int k = 0; k < nbPerso; k++) {
                        for (int l = -1; l < 5; l++) {
                            Object stockProtagonisteChoisie = null;
                            plateau[0][l + 1] = new affichageProtagonistes();
                        }
                        for (int l = -1; l < 5; l++) {
                            plateau[1][l + 1] = new affichageProtagonistes();
                        }
                    }
                    break;
                }
                while (numJoueur == 2) {
                    for (int k = 0; k < nbPerso; k++) {
                        for (int l = -1; l < 5; l++) {
                            plateau[9][l + 1] = new affichageProtagonistes();
                        }
                        for (int l = -1; l < 5; l++) {
                            plateau[8][l + 1] = new affichageProtagonistes();
                        }
                    }
                    break;
                }
            }
            i++;
            numJoueur++;
        }

        for (Joueur joueur : tabJoueurs) {
            System.out.println(joueur.getNomJoueur());
            System.out.println(joueur.getNumJoueur());
        }

    }
    public void affichage() {

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < nbPerso; i++) {
            for (int j = 0; j < nbPerso / 2; j++) {
                if (plateau[i][j] != null) {
//                    System.out.print("| " + plateau[i][j].affichageProtagonistes() + " / PV:" + plateau[i][j].getVie() + " ");
                } else {

                    System.out.print("|        ");
                }
            }
            System.out.println("|");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }

    }

    public static void main(String[] args) {
        setUp setUp = new setUp();
        setUp.affichage();
    }
}

