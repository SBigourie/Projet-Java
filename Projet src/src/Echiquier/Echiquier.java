package Echiquier;
import joueur.Joueur;
import protagonistes.EtreVivant;


public class Echiquier {

    int nbEtreVivant = 10;
    private String tour = String.valueOf('b');
    private Joueur joueur = new Joueur();
    private EtreVivant[][] plateau = new EtreVivant[nbEtreVivant][nbEtreVivant];

//nombre de case

    public Echiquier() {

        while joueur = "Joueur1"{
        for (int i = 0; i < nbEtreVivant; i++) {
            for (int j = -1; j < 5; j++) {
                plateau[0][j + 1] = new EtreVivant("toto",150);
            }
            for (int j = -1; j < 5; j++) {
                plateau[1][j + 1] = new EtreVivant("tata", 200);
            }
        }
        }
    }

    public void affichage() {

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < nbEtreVivant; i++) {
            for (int j = 0; j < nbEtreVivant / 2; j++) {
                if (plateau[i][j] != null) {
                    System.out.print("| " + plateau[i][j].getNom() +" / PV:"+ plateau[i][j].getVie() + " ");
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
        if (plateau[xOrig][yOrig].joueur(joueur) != tour) {
            return false;
        }
        if (plateau[xDest][yDest] != null) {
            if (plateau[xDest][yDest].joueur(joueur) == plateau[xOrig][yOrig].joueur(joueur)){
                return false;
            }

        }

        if (!plateau[xOrig][yOrig].isValid(xOrig,yOrig,xDest,yDest)){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Echiquier echiquier = new Echiquier();
        echiquier.affichage();
    }
}
