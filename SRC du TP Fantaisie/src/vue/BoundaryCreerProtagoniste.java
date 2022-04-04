package vue;

import controleur.ControleurCreerProtagoniste;
import protagonistes.StockEtreVivant;
import protagonistes.TypeEtreVivant;

import java.util.Scanner;

public class BoundaryCreerProtagoniste {
    ControleurCreerProtagoniste controleur;


    public BoundaryCreerProtagoniste(ControleurCreerProtagoniste controleur) {
        this.controleur = controleur;
    }

    public void creerProtagoniste() {


        int numTypeProtagoniste;
        TypeEtreVivant typeEtreVivant = null;

        do {
            System.out.println("Quel type de personnage souhaitez-vous créer ?");
            System.out.println("1 - un héros");
            System.out.println("2 - un homme");
            System.out.println("3 - un dragon");

            numTypeProtagoniste = Clavier.entrerClavierInt();

            if (numTypeProtagoniste == 1) {
                typeEtreVivant = TypeEtreVivant.HEROS;
            } else if (numTypeProtagoniste == 2) {
                typeEtreVivant = TypeEtreVivant.HOMME;
            } else if (numTypeProtagoniste == 3) {
                typeEtreVivant = TypeEtreVivant.DRAGON;
            } else {
                System.out.println("\nVous devez entrer un nombre entre 1 et 3");
            }

        } while (numTypeProtagoniste < 1 || numTypeProtagoniste > 3);


        System.out.println("Comment souhaitez-vous l'appeler ?");

        String nom = Clavier.entrerClavierString();

        controleur.creerEtreVivant(typeEtreVivant, nom);


    }
}
