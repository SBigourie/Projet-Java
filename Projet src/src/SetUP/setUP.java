package SetUP;
import java.util.InputMismatchException;
import java.util.Scanner;

public class setUP {
    public static void main(String [] args) {
        champDeBataille champDeBataille = new champDeBataille();
        System.out.println("Saisir xOrig, yOrig, xDest, yDest:");
        int xOrig = 0, yOrig, xDest, yDest;
        Scanner scanner = new Scanner(System.in);


        while (xOrig >= 0) {

            champDeBataille.affichage();
            try {
                System.out.println("Joueur "+ champDeBataille.numJoueur + "Saisir xOrig, yOrig, xDest, yDest:");
                xOrig = scanner.nextInt();
                yOrig = scanner.nextInt();
                xDest = scanner.nextInt();
                yDest = scanner.nextInt();

                champDeBataille.moveTo(xOrig, yOrig, xDest, yDest);
            } catch (InputMismatchException e) {
                System.out.println("Mauvaise saisie");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Mauvais mouvement : " + e.getMessage());
            }
        }

    }
}
