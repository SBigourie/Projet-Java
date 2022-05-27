package SetUP;


import Affichage.affichageEtreVivant;
import Affichage.affichageProtagonistes;
import affrontement.Bataille;
import protagonistes.EtreVivant;

import java.util.Scanner;

public class champDeBataille {

    int nbPerso;
    int numJoueur = 1;
    private EtreVivant[][] plateau = new EtreVivant[10][10];

    private char tour = '1';


    public champDeBataille() {
        Bataille b = new Bataille(this.plateau);
        affichageEtreVivant affichageChoix = new affichageEtreVivant();
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 1) {

            System.out.println("Joueur n°1 veuillez choisir votre camps (exemple : 1) pour Gobelin) :");

            affichageChoix.affichage();
            int campsJoueur1 = scanner.nextInt();

            System.out.println("Combien de personnages voulez-vous ? (1 à 6)");
            nbPerso = scanner.nextInt();

            int k = 0;
            int a=0;

            for (int j = 0; j < nbPerso; j++) {

                System.out.println("Choisir votre protagonsite :");
                if (nbPerso > 3) {
                    if (k < 3) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 0, j);
                        k++;
                    }
                    else if (k < 7) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 1, a);
                        a++;
                        k++;
                    }
                }
                else {
                    affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 0, j);
                }
            }
            numJoueur ++;
            i++;
        }

        while (i < 2) {

            System.out.println("Joueur n°2 veuillez choisir camps (exemple : 1) pour Gobelin) :");
            affichageChoix.affichage();
            int campsJoueur2 = scanner.nextInt();

            System.out.println("Combien de personnages voulez-vous ? (1 à 6)");
            nbPerso = scanner.nextInt();

            int k = 0;
            int a=0;

            for (int j = 0; j < nbPerso; j++) {
                System.out.println("Choisir votre protagonsite :");
                if (nbPerso > 3) {
                    if (k < 3) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 6, j);
                        k++;
                    }
                    else if (k < 7) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 7, a);
                        a++;
                        k++;
                    }
                }
                else {
                    affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 7, j);
                }
            }
            numJoueur ++;

            i++;
        }
    }


    public void affichage() {

        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.plateau[i][j] != null) {
                    System.out.print("| " + this.plateau[i][j].toString() + " ");
                } else {

                    System.out.print("|                                ");
                }
            }
            System.out.println("|");
            System.out.println("-----------------------------------------------------------------------------------------------------");

        }

    }

    public boolean moveTo(int xOrig, int yOrig, int xDest, int yDest) throws IllegalArgumentException{
        if (xDest == xOrig && yDest == yOrig) {
            throw new IllegalArgumentException("Source et destination sont les memes");
        }
        if (xOrig < 0 || xOrig > 3 || xDest < 0 || yDest > 8) {
            throw new IllegalArgumentException("Source et/ou desitnation pas sur le plateau");
        }
        if (plateau[xOrig][yOrig] == null) {
            throw new IllegalArgumentException("Pas de protagonistes à cette emplacement");
        }

//        A qui le tour
        if (plateau[xDest][yDest].getJoueur() != tour) {
            throw new IllegalArgumentException("Ce n'est pas à toi de jouer");
        }
        if (plateau[xDest][yDest] != null) {
            if (plateau[xDest][yDest].getJoueur() == plateau[xOrig][yOrig].getJoueur()) {
                throw new IllegalArgumentException("Un protagoniste de ton camp est deja ici");
            }
        }
        if (plateau[xOrig][yOrig].isValid(xOrig, yOrig, xDest, yDest)) {
            throw new IllegalArgumentException("Mouvement non valide");
        }
        if (plateau[xOrig][yOrig].protagoniteChemin(xOrig, yOrig, xDest, yDest, plateau)) {
            throw new IllegalArgumentException("Protagoniste ici");
        }

        plateau[xDest][yDest] = plateau[xOrig][yOrig];
        plateau[xOrig][yOrig] = null;

        if (tour == 1 ) {
            nbPerso = 2;
            tour = 2;
        }
        else {
            nbPerso = 1;
            tour = 1;
        }
        return true;
    }

//    public static void main(String[] args) {
//        Echiquier echiquier = new Echiquier();
//        echiquier.affichage();
//    }
}
