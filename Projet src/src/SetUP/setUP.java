package SetUP;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import sauvegarde.Serialization;

public class setUP {
	

    public static void main(String [] args) throws InterruptedException {    	
        champDeBataille champDeBataille = new champDeBataille();
        String choix;

        System.out.println("Saisir xOrig, yOrig, xDest, yDest:");
        int xOrig = 0, yOrig, xDest, yDest;
        Scanner scanner = new Scanner(System.in);
        champDeBataille.numJoueur--;

        while (xOrig >= 0) {

            champDeBataille.affichage();

            System.out.println("Joueur "+ champDeBataille.numJoueur + "\nChoisir votre action (q pour quitter, s pour sauvegarder, c pour charger une partie sauvegarder et d pour déplacement) : ");
            choix = scanner.next();
            if(choix.equals("q")) {
            	System.exit(0);
            }else if(choix.equals("s")){
            	champDeBataille.saveGame();
                Thread.sleep(2000);
            }else if(choix.equals("c")) {
                champDeBataille.loadGame();
                Thread.sleep(2000);
            }
            else {
            	 try {
                     System.out.println("Joueur "+ champDeBataille.numJoueur + " Saisir xOrig, yOrig, xDest, yDest:");
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
}
