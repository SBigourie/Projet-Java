package Echiquier;

import protagonistes.EtreVivant;

public class Echiquier {

    int nbEtreVivant = 10;
    private EtreVivant[][] plateau = new EtreVivant[nbEtreVivant][nbEtreVivant];

//nombre de case

    public Echiquier(){
        for (int i = 0; i < nbEtreVivant; i++) {
            for (int j = -1; j < 5; j++) {
                plateau[0][j+1] = new EtreVivant("toto",150);
            }
            for (int j = -1; j < 5; j++) {
                plateau[1][j+1] = new EtreVivant("tata", 200);
            }
        }
    }
    public void affichage(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < nbEtreVivant; i++) {
            for (int j = 0; j < nbEtreVivant/2; j++) {
                if (plateau[i][j] != null) {
                    System.out.print("| " + plateau[i][j].toString() + " ");
                }
                else {

                    System.out.print("|                           ");
                }
            }
            System.out.println("|");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }

    }
    public static void main (String[] args){
        Echiquier echiquier = new Echiquier();
        echiquier.affichage();
    }
}
