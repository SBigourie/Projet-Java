package SetUP;


import Affichage.affichageEtreVivant;
import Affichage.affichageProtagonistes;
import affrontement.Bataille;
import protagonistes.EtreVivant;
import protagonistes.monstre.Geant;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class champDeBataille implements Serializable {

    int nbPerso;
    int numJoueur = 1;
    private static EtreVivant[][] plateau = new EtreVivant[8][3];

    private char tour = '1';


    public champDeBataille() {
        Bataille b = new Bataille(plateau);
        affichageEtreVivant affichageChoix = new affichageEtreVivant();
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 1) {

            System.out.println("Joueur n°1 veuillez choisir votre camps (exemple : 1) pour Gobelin) :");

            affichageChoix.affichage();
            int campsJoueur1 = scanner.nextInt();

            System.out.println("Combien de personnages voulez-vous ? (1 à 6)");
            nbPerso = scanner.nextInt();

            int k = 0;
            int a = 0;

            for (int j = 0; j < nbPerso; j++) {

                System.out.println("Choisir votre protagonsite :");
                if (nbPerso > 3) {
                    if (k < 3) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 0, j, numJoueur);
                        k++;
                    } else if (k < 7) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 1, a, numJoueur);
                        a++;
                        k++;
                    }
                } else {
                    affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 0, j, numJoueur);
                }
            }
            i++;
        }

        numJoueur++;

        while (i < 2) {

            System.out.println("Joueur n°2 veuillez choisir camps (exemple : 1) pour Gobelin) :");
            affichageChoix.affichage();
            int campsJoueur2 = scanner.nextInt();

            System.out.println("Combien de personnages voulez-vous ? (1 à 6)");
            nbPerso = scanner.nextInt();

            int k = 0;
            int a = 0;

            for (int j = 0; j < nbPerso; j++) {
                System.out.println("Choisir votre protagonsite :");
                if (nbPerso > 3) {
                    if (k < 3) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 7, j, numJoueur);
                        k++;
                    } else if (k < 7) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 6, a, numJoueur);
                        a++;
                        k++;
                    }
                } else {
                    affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 7, j, numJoueur);
                }

            }
            i++;
        }
    }


    public void affichage() {
        System.out.println("\n            y=0                            y=1                            y=2                ");
        System.out.println("\n-------------------------------------------------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                if (plateau[i][j] != null) {
                    System.out.print("| " + plateau[i][j].toString());
                } else {

                    System.out.print("|                             ");
                }
            }
            System.out.println("| x=" + i);
            System.out.println("-------------------------------------------------------------------------------------------");

        }

    }

    public boolean moveTo(int xOrig, int yOrig, int xDest, int yDest) throws IllegalArgumentException {
        if (xDest == xOrig && yDest == yOrig) {
            throw new IllegalArgumentException("Source et destination sont les memes");
        }
        if (xOrig < 0 || xOrig >= 8 || xDest < 0 || xDest >= 8 || yOrig < 0 || yOrig >= 3 || yDest < 0 || yDest >= 3) {
            throw new IllegalArgumentException("Source et/ou destination pas sur le plateau");
        }

        if (plateau[xOrig][yOrig] == null) {
            throw new IllegalArgumentException("Pas de protagonistes Ã  cette emplacement");
        }

//      A qui le tour
        if (plateau[xOrig][yOrig].getJoueur() != numJoueur) {
            throw new IllegalArgumentException("Ce protagoniste ne t'appartient pas");
        }
        if (plateau[xDest][yDest] != null) {
            if (plateau[xDest][yDest].getJoueur() == plateau[xOrig][yOrig].getJoueur()) {
                throw new IllegalArgumentException("Un protagoniste de ton camp est deja ici");
            }
        }
        if (plateau[xOrig][yOrig].isValid(xOrig, yOrig, xDest, yDest)) {
            throw new IllegalArgumentException("Mouvement non valide");
        }
        if (plateau[xOrig][yOrig].protagoniteCombat(xOrig, yOrig, xDest, yDest, plateau)) {
            throw new IllegalArgumentException("Protagoniste ici");
        }
        if (plateau[xDest][yDest] != null) {
            if (plateau[xDest][yDest].getJoueur() != plateau[xOrig][yOrig].getJoueur()) {
                plateau[xDest][yDest].subirAttaque(plateau[xOrig][yOrig].getDegat());
                plateau[xOrig][yOrig].subirAttaque(plateau[xDest][yDest].getDegat());
                if (plateau[xDest][yDest].getVie() < 0) {
                    System.out.println("mort");
                    plateau[xDest][yDest] = plateau[xOrig][yOrig];
                    plateau[xOrig][yOrig] = null;
                }
            }
        }
        else {
            plateau[xDest][yDest] = plateau[xOrig][yOrig];
            plateau[xOrig][yOrig] = null;
        }

        if (this.numJoueur == 1) {
            this.numJoueur++;
        } else {
            this.numJoueur--;
        }


        if (tour == 1) {
            nbPerso = 2;
            tour = 2;
        } else {
            nbPerso = 1;
            tour = 1;
        }
        return true;
    }

    public static void saveGame() {
        try {
            FileOutputStream fos = new FileOutputStream("backup.sav");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(plateau);
            oos.flush();
            oos.close();
            System.out.println("Jeu sauvegarder \n");
        } catch (Exception e) {
            System.out.println("Erreur : problème lors de la sauvegarde \n" + e);
        }
    }

    public static void loadGame() {
        try {
            FileInputStream fis = new FileInputStream("backup.sav");
            ObjectInputStream ois = new ObjectInputStream(fis);
            plateau = (EtreVivant[][]) ois.readObject();
            ois.close();
            System.out.println("Jeu charger \n");
        } catch (Exception e) {
            System.out.println("Erreur : problème lors du chargement du jeu \n" + e);
        }
    }

}
