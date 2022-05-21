package setUp;

import java.util.Scanner;

import affrontement.Bataille;
import joueur.Joueur;
import protagonistes.EtreVivant;
import protagonistes.TypeEtreVivant;
import protagonistes.affichageEtreVivant;
import protagonistes.affichageProtagonistes;
import stockage.StockEtreVivant;
import stockage.stockProtagonisteChoisie;


public class setUp {
    int nbPerso;
    int numJoueur = 1;
    private EtreVivant[][] plateau = new EtreVivant[10][10];


    public setUp() {
        Bataille b = new Bataille(this.plateau);
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
                    affichageProtagonistes.affichageSequenceDeProtagoniste(camps, b, 9-i*8, j);

            }
            numJoueur++;
            i++;
        }
    }

    public void affichage() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 / 2; j++) {
                if (plateau[i][j] != null) {
                    System.out.print("| " + plateau[i][j].getNom() + " / PV:" + plateau[i][j].getVie() + " ");
                } else
                {

                    System.out.print("|    ici    ");
                }
            }
        }
        System.out.println("|");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }


    public static void main(String[] args) {
        setUp setUp = new setUp();
        setUp.affichage();
    }
}

