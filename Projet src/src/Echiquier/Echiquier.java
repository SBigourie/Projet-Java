package Echiquier;

import joueur.Joueur;
import protagonistes.EtreVivant;


public class Echiquier {

    int nbEtreVivant = 10;
    private int tour = 1;
    private Joueur joueur1 = new Joueur(, 1);
    private Joueur joueur2=  new Joueur(, 2);
    private EtreVivant[][] plateau = new EtreVivant[nbEtreVivant][nbEtreVivant];

//nombre de case

    public Echiquier() {

        while (joueur1.getNumJoueur() == 1) {
            for (int i = 0; i < nbEtreVivant; i++) {
                for (int j = -1; j < 5; j++) {
                    plateau[0][j + 1] = new EtreVivant("toto", 150);
                }
                for (int j = -1; j < 5; j++) {
                    plateau[1][j + 1] = new EtreVivant("tata", 200);
                }
            }
            break;
        }

        while (joueur2.getNumJoueur() == 2) {
            for (int i = 0; i < nbEtreVivant; i++) {
                for (int j = -1; j < 5; j++) {
                    plateau[9][j + 1] = new EtreVivant("toto2", 150);
                }
                for (int j = -1; j < 5; j++) {
                    plateau[8][j + 1] = new EtreVivant("tata2", 200);
                }
            }
            break;
        }
    }

    public void affichage() {

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < nbEtreVivant; i++) {
            for (int j = 0; j < nbEtreVivant / 2; j++) {
                if (plateau[i][j] != null) {
                    System.out.print("| " + plateau[i][j].getNom() + " / PV:" + plateau[i][j].getVie() + " ");
                } else {

                    System.out.print("|        ");
                }
            }
            System.out.println("|");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }

    }

    public boolean moveTo(int xOrig, int yOrig, int xDest, int yDest) {
        if (xDest == xOrig && yDest == yOrig) {
            return false;
        }
        if (xOrig <= 0 || xOrig > 10 || xDest < 0 || yDest > 0) {
            return false;
        }
        if (plateau[xOrig][yOrig] == null) {
            return false;
        }

        //A qui le tour
        if (joueur1.getNumJoueur() != 1){
            return false;
        }
        if (plateau[xDest][yDest] != null) {
            if (plateau[xDest][yDest].joueur(joueur1) == plateau[xOrig][yOrig].joueur(joueur1)) {
                return false;
            }
            if (plateau[xDest][yDest].joueur(joueur2) == plateau[xOrig][yOrig].joueur(joueur2)) {
                return false;
            }
        }

        if (!plateau[xOrig][yOrig].isValid(xOrig, yOrig, xDest, yDest)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Echiquier echiquier = new Echiquier();
        echiquier.affichage();
    }
}
