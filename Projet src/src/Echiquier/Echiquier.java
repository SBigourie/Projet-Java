package Echiquier;

import protagonistes.EtreVivant;

public class Echiquier {

//plateau
    private EtreVivant[][] plateau = new EtreVivant[10][10];

    //tour
//    private char tour = "c";


    public Echiquier(){
        this.plateau[0][0] = new EtreVivant("prinplouf",150);

    }
}
