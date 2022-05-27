package SetUP;
import java.util.InputMismatchException;
import java.util.Scanner;

public class setUP {
    public static void main(String [] args) {
        Echiquier echiquier = new Echiquier();
        System.out.println("Saisir xOrig, yOrig, xDest, yDest:");
        int xOrig = 0, yOrig, xDest, yDest;
        Scanner scanner = new Scanner(System.in);


        while (xOrig >= 0) {

            echiquier.affichage();
            try {
                System.out.println("Joueur "+ echiquier.numJoueur + "Saisir xOrig, yOrig, xDest, yDest:");
                xOrig = scanner.nextInt();
                yOrig = scanner.nextInt();
                xDest = scanner.nextInt();
                yDest = scanner.nextInt();

                echiquier.moveTo(xOrig, yOrig, xDest, yDest);
            } catch (InputMismatchException e) {
                System.out.println("Mauvaise saisie");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Mauvais mouvement : " + e.getMessage());
            }
        }

    }
}
